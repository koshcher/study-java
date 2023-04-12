package Task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);

            int start = scanner.nextInt();
            int end = scanner.nextInt();

            // check
            if(end < start) {
                final int tmp = end;
                end = start;
                start = tmp;
            }

            for (int i = start; i <= end; ++i) {
                for (int j = 1; j < 11; ++j) {
                    System.out.println(i + "*" + j + " = " + (i * j));
                }
            }

        } catch (Exception ex)  {
            System.out.print("Input is'n correct");
        }
    }
}
