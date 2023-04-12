package Task1;


import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        final Store store = new Store();
        ThreadGroup threadGroup = new ThreadGroup("main");

        Object lock = new Object();
        Thread randomNumsThread = new Thread(threadGroup, () -> fillWithRandomNums(store, lock));
        randomNumsThread.start();

        Thread sumThread = new Thread(threadGroup, () -> {
            try {
                sum(store, lock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        sumThread.start();
        Thread avgThread = new Thread(threadGroup, () -> {
            try {
                avg(store, lock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        avgThread.start();


        while (threadGroup.activeCount()!=0);

        store.nums.forEach(num -> System.out.print(num + " "));
        System.out.println();
        System.out.println("sum: " + store.sum);
        System.out.println("avg: " + store.avg);

    }

    public static void fillWithRandomNums(Store store, Object lock) {
        var rnd = new Random();
        for (int i = 0; i < 1000; i++) {
            store.nums.add(rnd.nextInt() % 100);
        }
        synchronized (lock) {
            store.isFilled = true;
            lock.notify();
        }
    }

    public static void sum(Store store, Object lock) throws InterruptedException {
        synchronized (lock) {
            if(!store.isFilled) {
                lock.wait();
            }
        }
        int sum = 0;
        for (var num: store.nums) {
            sum+=num;
        }
        store.sum = sum;
    }

    public static void avg(Store store, Object lock) throws InterruptedException {
        synchronized (lock) {
            if(!store.isFilled) {
                lock.wait();
            }
        }
        int sum = 0;
        for (var num: store.nums) {
            sum+=num;
        }
        store.avg = 1.0 * sum / store.nums.size();
    }

}

