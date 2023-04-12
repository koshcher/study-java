import java.util.Arrays;
import java.util.stream.Collectors;

public class StringCalculator {

    public static int add(String value) {
        if(value == null || value.isEmpty()) return 0;

        var separator = ",\n ";
        if(value.startsWith("//")) {
            int separatorEnd = value.indexOf("\n");
            if(separatorEnd != -1) {
                separator += value.substring(2, separatorEnd);
                value = value.substring(separatorEnd);
            }
        }

        return Arrays.stream(value.split("[" + separator + "]"))
                .filter(str -> !str.trim().isEmpty())
                .map(Integer::parseInt)
                .filter(num -> num < 1000)
                .reduce(0, Integer::sum);
    }
}
