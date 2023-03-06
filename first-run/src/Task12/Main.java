package Task12;

import Shared.Shared;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    // selection sort
    public static void sort(int[] arr, boolean desc) {
        final BiFunction<Integer, Integer, Boolean> compare = desc
                ? (Integer f, Integer s) -> f > s
                : (Integer f, Integer s) -> f < s;

        for (int i = 0; i < arr.length - 1; ++i) {
            int min = arr[i];
            int minI = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if(compare.apply(arr[j], min)) {
                    min = arr[j];
                    minI = j;
                };
            }
            arr[minI] = arr[i];
            arr[i] = min;
        }
    }

    public static void main(String[] args){
        try {

            System.out.println("Before:");
            int[] arr = Shared.gen(10);

            sort(arr, false);
            System.out.println("\nAfter asc:");
            Shared.printArr(arr);

            sort(arr, true);
            System.out.println("\nAfter desc:");
            Shared.printArr(arr);
        } catch (Exception ex)  {
            System.out.print("Something went wrong");
        }
    }
}
