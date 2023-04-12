package Task6;

public class MathArray implements IMath {
    private final int[] arr;

    public MathArray(int[] arr) {
        this.arr = arr;
    }


    @Override
    public int Max() {
        if (arr.length == 0) return 0;

        int max = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            int number = arr[i];
            if (number > max) max = number;
        }
        return max;
    }

    @Override
    public int Min() {
        if (arr.length == 0) return 0;

        int min = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            int number = arr[i];
            if (number < min) min = number;
        }
        return min;
    }

    @Override
    public float Avg() {
        if (arr.length == 0) return 0;

        float sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
