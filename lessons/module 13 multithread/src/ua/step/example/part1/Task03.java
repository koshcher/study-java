package ua.step.example.part1;

/**
 * 
 * Создание потоков посредством реализации интерфейса Runnable 
 *
 */
public class Task03
{
    public static void main(String[] args)
    {
        Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 100; i++)
                {
                    try
                    {
                        // усыпляет поток на одну милисекунду
                        Thread.sleep(1);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println("A =" + i);
                }
            }
        });
        thread.start();

        thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 100; i > 0; i--)
                {
                    try
                    {
                     // усыпляет поток на три милисекунды
                        Thread.sleep(3);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println("B =" + i);
                }
            }
        });
        thread.start();
    }
}