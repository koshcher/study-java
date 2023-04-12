package Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrimeFinder extends FileFinder implements Runnable {
    final Object lock;
    Store store;
    public PrimeFinder(Object lock, Store store) {
        this.store = store;
        this.lock = lock;
    }

    private boolean isPrime(int num) {
        if(num<=1) return false;
        for(int i=2;i<=num/2;i++)
        {
            if(num % i==0) return false;
        }
        return true;
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
                if(isPrime(num)) {
                    store.primeNums.add(num);
                }

                line = reader.readLine();
            }

            writeResToFile(store.path, "primes.txt", store.primeNums);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
