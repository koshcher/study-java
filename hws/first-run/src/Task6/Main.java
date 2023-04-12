package Task6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Double[] coefficients = { 1.09361, 0.000621371, 39.3701 };
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter meters:");
            double meters = scanner.nextDouble();

            System.out.println("To what");
            System.out.println("[0] yards");
            System.out.println("[1] miles");
            System.out.println("[2] inches");
            int choice = scanner.nextInt();

            // check
            if(choice < 0 || choice > 2) {
                System.out.println("There isn't " + choice + " choice");
                return;
            }

            final double coefficient = coefficients[choice];
            System.out.println(meters * coefficient);
        } catch (Exception ex)  {
            System.out.print("Input is'n correct");
        }
    }
}
