import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Task4 {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        list.add(10);
        list.add(12);
        list.add(10);
        list.add(-7);
        list.add(-9);

        // 1
        var sumEquals = sum(num -> num == 10, list);
        System.out.println(sumEquals);

        // 2
        var sumDiapason = sum(num -> num > -8 && num <= 10, list);
        System.out.println(sumDiapason);

        // 3
        var sumPositive = sum(num -> num > 0, list);
        System.out.println(sumPositive);

        // 4
        var sumNegative = sum(num -> num < 0, list);
        System.out.println(sumNegative);
    }

    public static Integer sum(Function<Integer, Boolean> condition, List<Integer> list) {
        return  list.stream()
                .filter(condition::apply)
                .reduce(0, Integer::sum);
    }
}
