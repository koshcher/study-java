package Task6;

public class Main {
    public static void main(String[] args) {


        int[] nums = {1, 2, 4};
        var arr = new MathArray(nums);

        System.out.println("Max: " + arr.Max());
        System.out.println("Min: " + arr.Min());
        System.out.println("Avg: " + arr.Avg());
    }

}
