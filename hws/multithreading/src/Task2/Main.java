package Task2;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
        public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path to a file:");

        var store = new Store(scanner.nextLine());
        Object lock = new Object();

        ThreadGroup threadGroup = new ThreadGroup("main");

        Thread fillRandomNumsThread = new Thread(threadGroup, () -> fillRandomNums(store, lock));
        fillRandomNumsThread.start();

        Thread primeFinderThread = new Thread(threadGroup, new PrimeFinder(lock, store));
        primeFinderThread.start();

        Thread factorialFinderThread = new Thread(threadGroup, new FactorialFinder(lock, store));
        factorialFinderThread.start();

        while (threadGroup.activeCount()!=0);

        System.out.println("Prime nums: ");
        store.primeNums.forEach(num -> System.out.print(num + " "));
        System.out.println("\nFactorial nums: ");
        store.factorialNums.forEach(num -> System.out.print(num + " "));
    }

    public static void fillRandomNums(Store store, Object lock) {
        var rnd = new Random();
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(store.path));

            for (int i = 0; i < 10; i++) {
                writer.append(String.valueOf(rnd.nextInt() % 10));
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        synchronized (lock) {
            store.isFilled = true;
            lock.notify();
        }
    }

}
