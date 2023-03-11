package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ArrayService {
    private ArrayList<Integer> nums;

    public void input() {
        nums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Choose option: ");
            System.out.println("[0] add number");
            System.out.println("[anything else] finish");

            var choice = scanner.nextInt();
            if(choice != 0) break;

            nums.add(scanner.nextInt());
        }
    }

    public void generate(int length) {
        var rnd = new Random();
        nums = new ArrayList<>(length);

        for (var i = 0; i < length; ++i) {
            nums.add(rnd.nextInt());
        }
    }

    public void show() {
        for (Integer num:nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public Integer max() {
        if(nums.isEmpty()) return 0;
        Integer max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            var num = nums.get(i);
            if(num > max) max = num;
        }
        return  max;
    }

    public Integer min() {
        if(nums.isEmpty()) return 0;
        Integer min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            var num = nums.get(i);
            if(num < min) min = num;
        }
        return  min;
    }

    public double avg() {
        if(nums.isEmpty()) return 0;

        double sum = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum / nums.size();
    }

    public void sort() {
        Collections.sort(nums);
    }
    public void sortDescending() {
        Collections.sort(nums, Collections.reverseOrder());
    }

    public int binarySearch(int val) {
        sort();
        int index = Collections.binarySearch(nums, val);
        return index;
    }

    public void replace(int oldVal, int newVal) {
        int index = binarySearch(oldVal);
        if(index > -1) {
            nums.set(index, newVal);
        }
    }
}
