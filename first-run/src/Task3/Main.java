package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        final int count = 3;
        int num = 0;

        try {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < count; ++i) {
                num += scanner.nextInt() * Math.pow(10, count - i - 1);
            }
        } catch (Exception ex)  {
            System.out.print("Input is'n correct");
            return;
        }

        System.out.println("Result: " + num);
    }
}