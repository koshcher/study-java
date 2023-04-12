package Task7;


public class Main {
    public static void main(String[] args) {


        Integer[] nums = {2, 5, 4};
        var arr = new SortArray(nums);

        arr.Print();
        arr.SortAsc();
        arr.Print();
        arr.SortDesc();
        arr.Print();
    }
}
