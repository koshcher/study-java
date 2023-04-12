package ua.step.example.part2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * При вызове Thread.sleep мониторы не отпускаются!
 *
 */
public class Task05
{
    static final DateFormat FORMAT = new SimpleDateFormat("HH:mm:ss");

    public static void main(String[] args)
    {
        // Объект мониторинга
        Object sync = new Object();

        Thread t = new Thread(new WaitingThread(sync));
        t.start();
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex)
        {
            log("main::Прерван: " + ex.getMessage());
        }
        synchronized (sync)
        {
            log("main::Спит 5 сек");
            try
            {
                Thread.sleep(5000);
            }
            catch (InterruptedException ex)
            {
                log("main::Прерван: " + ex.getMessage());
            }
            log("main::Выход из синхранизированного блока");
        }
    }

    static class WaitingThread implements Runnable
    {
        private Object sync; // объект монитор

        public WaitingThread(Object sync)
        {
            this.sync = sync;
        }

        public void run()
        {
            synchronized (sync)
            {
                log("own:: Ждет 2 сек");
                try
                {
                    sync.wait(2000);
                }
                catch (InterruptedException ex)
                {
                    log("own:: Прерван: " + ex.getMessage());
                }
                log("own:: Запушен снова");
            }
        }
    }

    private static void log(String msg)
    {
        System.out.println(FORMAT.format(new Date()) + ": " + msg);
    }
}