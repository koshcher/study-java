package ua.step.example.part2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * notifyAll Запустите пример несколько раз и определить порядок выхода потоков
 * из состояния wait по notifyAll
 * 
 */
public class Task06
{
    static final DateFormat FORMAT = new SimpleDateFormat("HH:mm:ss");

    public static void main(String[] args)
    {
        Object sync = new Object(); // монитор
        for (int i = 0; i < 5; i++)
        {
            Thread t = new Thread(new WaitingThread(sync));
            t.start();
        }
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex)
        {
            System.err.println("main::  Прерван: " + ex.getMessage());
        }
        synchronized (sync)
        {
            log("главный поток::Вызов notifyAll");
            sync.notifyAll();
            log("главный поток::Уснул на  3 сек");
            try
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException ex)
            {
                System.err.println("главный поток::Прерван: " + ex.getMessage());
            }
            log("main::  Выход из блока синхранизации");
        }
    }

    static void log(String msg)
    {
        System.out.println(FORMAT.format(new Date()) + ": " + msg);
    }

    static class WaitingThread implements Runnable
    {
        static int nextId = 1;

        private Object sync; // монитор

        private int id;

        public WaitingThread(Object sync)
        {
            this.sync = sync;
            id = nextId++;
        }

        public void run()
        {
            synchronized (sync)
            {
                log("поток(" + id + "):: Ждет");
                try
                {
                    // заставляет поток ожидать вызова notify илл notifyAll
                    sync.wait();
                    // монитор отпускается и может быть захвачен другим потоком
                }
                catch (InterruptedException ex)
                {
                    log("own(" + id + "):: Прерван: " + ex.getMessage());
                }
                log("поток(" + id + "):: Запушен снова");
                log("поток(" + id + "):: Заснул на 1 сек");
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException ex)
                {
                    log("поток(" + id + "):: Прерван: " + ex.getMessage());
                }
                log("поток(" + id + "):: Закончил работу");
            }
        }
    }
}