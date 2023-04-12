package ua.step.example.part2;

/**
 * 
 * Гонка потоков. Синхронизация методов
 *
 */
public class Task00
{
    public static void main(String[] args) throws InterruptedException
    {
        State state = new State();
        for (int i = 0; i < 100; i++)
        {
            Runnable runnable = () -> {
                for (int j = 0; j < 100; j++)
                {
                    state.incX();
                }
                System.out.println(state.getX());
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }

    }
}

class State
{
    private Integer x = 0;

    public  void incX()
    {
        x++;
    }

    public int getX()
    {
        return x;
    }
}