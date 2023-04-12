package Task7;

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

            int i = start % 2 == 0 ? start : start + 1;
            for (; i <= end; i += 2) System.out.println(i);

        } catch (Exception ex)  {
            System.out.print("Input is'n correct");
        }
    }
}
