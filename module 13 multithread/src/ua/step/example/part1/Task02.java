package ua.step.example.part1;

/**
 * 
 * Создание потока путем наследования от класса Thread
 *
 */
public class Task02
{
    public static void main(String[] args)
    {
        Thread thred = new MyThred("A");
        thred.run(); // ошибка, будет запущен не отдельный поток, а просто метод в основном потоке!!!
        //thred.start();
        Thread thred1 = new MyThred("B");
        thred1.start();
        System.out.println("End main");
    }

    private static class MyThred extends Thread
    {
        private final String name;

        public MyThred(String name)
        {
            this.name = name;
        }

        @Override
        public void run()
        {
            System.out.printf("Поток %s начал работу\n", name);
            for (int i = 0; i < 1000; i++)
            {
                System.out.println(name + " " + i);
            }
            System.out.printf("Поток %s закончил работу\n", name);
        }
    }
}