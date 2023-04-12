package Task3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // 1
        FourFunction<Integer, Integer, Integer, Integer, Integer> max4 = (num1, num2, num3, num4) -> {
            var asList = new ArrayList<Integer>();
            asList.add(num1);
            asList.add(num2);
            asList.add(num3);
            asList.add(num4);
            return Collections.max(asList);
        };

        var res = max4.apply(2020, -1, 10,423);
        System.out.println(res);


        // 2
        FourFunction<Integer, Integer, Integer, Integer, Integer> min4 = (num1, num2, num3, num4) -> {
            var asList = new ArrayList<Integer>();
            asList.add(num1);
            asList.add(num2);
            asList.add(num3);
            asList.add(num4);
            return Collections.min(asList);
        };

        res = min4.apply(2020, -1, 10,423);
        System.out.println(res);
    }
}
