package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double num;
        double percent;

        try {
            Scanner scanner = new Scanner(System.in);
            num =  scanner.nextDouble();
            percent = scanner.nextDouble();
        } catch (Exception ex)  {
            System.out.print("Input is'n correct");
            return;
        }

        System.out.println("Result: " + (num * percent / 100));
    }
}