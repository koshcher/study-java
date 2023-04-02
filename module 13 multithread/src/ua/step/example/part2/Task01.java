package ua.step.example.part2;

/**
 * 
 * Гонка потоков. Синхронизация методов
 *
 */
public class Task01
{
    public static void main(String[] args) throws InterruptedException
    {
        final Counter counter = new Counter();
        ThreadGroup group = new ThreadGroup("main");
        for (int i = 0; i < 10; i++)
        {
            MyThread t1 = new MyThread(counter, i);
            Thread t = new Thread(group, t1);
            t.start();
        }
        while (group.activeCount()!=0);
        System.out.printf("Итого счетчик равен %d", counter.getCount());
    }
}

class Counter
{
    //FIXME раскоментируй volatile по указанию преподователя 
    private /* volatile */ long count;

    //FIXME раскоментируй synchronized по указанию преподователя
    public /* synchronized */ void increment(int id)
    {
        System.out.printf("Поток %3d увеличивает счетик%n", id);
        count++;
    }
    
    //FIXME раскоментируй synchronized по указанию преподователя
    public /* synchronized */ void decrement(int id)
    {
        System.out.printf("Поток %3d   уменьшает счетик%n", id);
        count--;
    }

    public long getCount()
    {
        return count;
    }
}

class MyThread implements Runnable
{
    private /*volatile*/ Counter counter;

    private int id;

    public MyThread(Counter counter, int id)
    {
        this.counter = counter;
        this.id = id;
    }

    @Override
    public void run()
    {
        //System.out.println("Thread id = " + id + " start");
        for (int i = 0; i < 100; i++)
        {
            if (id % 2 == 0)
            {
                counter.increment(id);
            }
            else
            {
                counter.decrement(id);
            }
            try
            {
                Thread.currentThread();
                Thread.sleep(1);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        //System.out.println("Thread id = " + id + " end");
    }
}