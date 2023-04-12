package Task9;

import Shared.Shared;

public class Main {
    public static void main(String[] args){
        try {
            int[] arr = Shared.gen(10);

            int max = arr[0];
            int min = arr[0];
            int zero = 0;
            int plus = 0;
            int minus = 0;
            for (int i = 0; i < arr.length; ++i) {
                final int el = arr[i];

                if(el == 0) ++zero;
                else if(el > 0) ++plus;
                else ++minus;

                if(el > max) max = el;
                if(el < min) min = el;
            }

            System.out.print("Max: " + max + "; Min: " + min + "; Zeros: " +zero +"; With +: " + plus + "; With -: " + minus);
        } catch (Exception ex)  {
            System.out.print("Something went wrong");
        }
    }
}
