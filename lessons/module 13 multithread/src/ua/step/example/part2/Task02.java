package ua.step.example.part2;

/**
 * 
 * Пример взаимной блокировки Deadlock
 * 
 */
public class Task02
{
    public static void main(String[] args)
    {
        Resourcer a1 = new Resourcer();
        Resourcer a2 = new Resourcer();
        Thread t1 = new Thread(new Tester(a1, a2));
        Thread t2 = new Thread(new Tester(a2, a1));
        t1.start();
        t2.start();
    }

    public static class Tester implements Runnable
    {
        static int nextId = 1;
        // первый ресурс
        private Resourcer obj1;
        // второй ресурс
        private Resourcer obj2;

        private int id = 0;

        public Tester(Resourcer obj1, Resourcer obj2)
        {
            this.obj1 = obj1;
            this.obj2 = obj2;
            id = nextId++;
        }

        public void run()
        {
            print("Устанавливает значение obj1... ");
            obj1.setValue(id);
            print("done.");
            print("Сравнение объектов... ");
            print("Done. Результат: " + ((obj1.equals(obj2)) ? "equal" : "not equal"));
        }

        private void print(String msg)
        {
            System.out.println("Thread #" + id + ": " + msg);
        }
    }

    public static class Resourcer
    {
        private int value = 0;

        synchronized void setValue(int value)
        {
            this.value = value;
        }

        synchronized int getValue()
        {
            return value;
        }

        public synchronized boolean equals(Object o)
        {
            Resourcer a = (Resourcer) o;
            try
            {
                // Задержка нужна для имитация долгой работы метода.
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                System.err.println("Прерывание!");
            }
            return value == a.getValue();
        }
    }
}
