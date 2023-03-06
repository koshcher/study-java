package Task5;

import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            // check
            if(num < 1 || num > 12) {
                System.out.println("There isn't " + num + " month");
                return;
            }

            // find season of the year
            // max 3 checks
            if(num < 6) {
                if(num < 3) System.out.println("WINTER");
                else System.out.println("SPRING");
            } else {
                if(num < 9 ) System.out.println("SUMMER");
                else if (num == 12) System.out.println("WINTER");
                else System.out.println("AUTUMN");
            }
        } catch (Exception ex)  {
            System.out.print("Input is'n correct");
        }
    }
}
