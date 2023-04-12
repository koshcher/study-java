package Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FactorialFinder extends FileFinder implements Runnable {
    final Object lock;
    Store store;
    public FactorialFinder(Object lock, Store store) {
        this.store = store;
        this.lock = lock;
    }

    private long factorial(int num) {
        if(num < 0) return 0;
        long fact = 1;
        for(int i = 1; i <= num; i++) fact *= i;
        return fact;
    }


    @Override
    public void run() {
        synchronized (lock) {
            if(!store.isFilled) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(store.path));

            String line = reader.readLine();
            while (line != null) {

                line = line.trim();
                if(line.isEmpty()) break;

                var num = Integer.parseInt(line);

                store.factorialNums.add(factorial(num));

                line = reader.readLine();
            }

            writeResToFile(store.path, "factorials.txt", store.factorialNums);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
