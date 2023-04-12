package Task7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortArray implements ISort {
    private final Integer[] arr;

    public SortArray(Integer[] arr) {
        this.arr = arr;
    }

    public void Print() {
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    @Override
    public void SortAsc() {
        Arrays.sort(arr);
    }

    @Override
    public void SortDesc() {
        Arrays.sort(arr, Comparator.reverseOrder());
        Integer[] cubes = new Integer[]{8, 27, 64, 125, 256};
        Arrays.sort(cubes, Collections.reverseOrder());

    }
}
