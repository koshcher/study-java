package Shared;

import java.util.Random;

public class Shared {
    public static int[] gen(int count) {
        Random rd = new Random();
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt() % 100;
            System.out.print( arr[i] + " "); // to see results
        }
        System.out.println();
        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i =0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
