package Task4;

import java.util.Scanner;

public class Main {
    private static void checkNumLenth(int num) throws Exception {
        final double k = num / 100000;
        if (k < 1 || k >= 10) {
            throw new Exception();
        }
    }

    private static int swap(int num) throws Exception {
        checkNumLenth(num);

        // dirty
        String numStr = Integer.toString(num);
        StringBuilder sb  = new StringBuilder();
        sb.append(numStr.charAt(5));
        sb.append(numStr.charAt(4));
        sb.append(numStr.charAt(2));
        sb.append(numStr.charAt(3));
        sb.append(numStr.charAt(1));
        sb.append(numStr.charAt(0));

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            int res = swap(num);
            System.out.println("Result: " + res);

        } catch (Exception ex)  {
            System.out.print("Input is'n correct");
        }
    }
}