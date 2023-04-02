package ua.step.example.part1;

/*
 *  Создание потока с помошью лямбда выражения  
 */
public class Task01
{
    public static void main(String[] args)
    {
        System.out.println("Главный поток начал работу");
        
        Thread thread = new Thread(()-> {
            System.out.println("Поток A начал работу");
            for (int i = 0; i < 100; i++)
            {
                System.out.println("A " + " " + i);
            }
            System.out.println("Поток A закончил работу");  
        });
        // запуск потока 
        thread.start();
        System.out.println("Главный поток закончил работу");
    }
}