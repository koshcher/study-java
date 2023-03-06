package Task10;

import Shared.Shared;

public class Main {

    public static void main(String[] args){
        try {
            int[] arr = Shared.gen(10);

            // if not to use dynamic arrays
            // such names because we will use it as index in future
            int evensInt = 0;
            int plusInt = 0;
            int minusInt = 0;

            // count first of all
            for (int i = 0; i < arr.length; ++i) {
                final int el = arr[i];
                if(el % 2 == 0) ++evensInt;
                if(el > 0) ++plusInt;
                else  if(el < 0) ++minusInt;
            }

            int[] evens = new int[evensInt];
            int[] odds = new int[arr.length - evensInt];
            int[] pluses = new int[plusInt];
            int[] minuses = new int[minusInt];


            int oddInt = 0;
            evensInt = 0;
            plusInt = 0;
            minusInt = 0;

            for (int i = 0; i < arr.length; ++i) {
                final int el = arr[i];

                if(el % 2 == 0) {
                    evens[evensInt] = el;
                    ++evensInt;
                } else {
                  odds[oddInt] = el;
                  ++oddInt;
                }

                if(el > 0) {
                    pluses[plusInt] = el;
                    ++plusInt;
                }
                else  if(el < 0) {
                    minuses[minusInt] = el;
                    ++minusInt;
                }
            }


            System.out.println("Odds:");
            Shared.printArr(odds);

            System.out.println("Evens:");
            Shared.printArr(evens);

            System.out.println("With +:");
            Shared.printArr(pluses);

            System.out.println("With -:");
            Shared.printArr(minuses);
        } catch (Exception ex)  {
            System.out.print("Input is'n correct");
        }
    }
}
