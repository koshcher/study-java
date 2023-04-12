import Task1.ArrayService;

public class Main {
    public static void main(String[] args) {

        var arr = new ArrayService();
        arr.generate(5);
        arr.show();

        arr.sort();
        arr.show();

        arr.sortDescending();
        arr.show();
    }
}