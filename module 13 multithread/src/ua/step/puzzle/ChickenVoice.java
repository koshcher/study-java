package ua.step.puzzle;

/**
 * Что было в начале, яйцо или курица?
 */
class EggVoice extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            try
            {
                sleep(1000); // Приостанавливает поток на 1 секунду
            }
            catch (InterruptedException e)
            {
            }

            System.out.println("яйцо!");
        }
        // Слово «яйцо» сказано 5 раз
    }
}

public class ChickenVoice // Класс с методом main()
{
    public static void main(String[] args)
    {
        EggVoice mAnotherOpinion = new EggVoice(); // Создание потока
        System.out.println("Спор начат...");
        mAnotherOpinion.start(); // Запуск потока

        for (int i = 0; i < 5; i++)
        {
            try
            {
                Thread.sleep(1000); // Приостанавливает поток на 1 секунду
            }
            catch (InterruptedException e)
            {
            }
            System.out.println("курица!");
        }

        // Слово «курица» сказано 5 раз

        if (mAnotherOpinion.isAlive()) // Если оппонент еще не сказал последнее
                                       // слово
        {
            try
            {
                mAnotherOpinion.join(); // Подождать пока оппонент закончит
                                        // высказываться.
            }
            catch (InterruptedException e)
            {
            }

            System.out.println("Первым появилось яйцо!");
        }
        else // если оппонент уже закончил высказываться
        {
            System.out.println("Первой появилась курица!");
        }
        System.out.println("Спор закончен!");
    }
}