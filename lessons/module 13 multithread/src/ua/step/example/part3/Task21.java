package ua.step.example.part3;

/**
 * 
 * Исключительные ситуации в потоках
 *
 */
public class Task21
{
    public static void main(String[] args)
    {
        Thread thread = new Thread(new Runnable()
        {
            public void run()
            {
                throw new RuntimeException();
            }
        });  

        Thread thread1 = new Thread(new Runnable()
        {
            public void run()
            {
                throw new RuntimeException();
            }
        });
        thread.start();
        thread1.start();
    }
}
