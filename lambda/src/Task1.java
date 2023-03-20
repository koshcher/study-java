import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Task1 {

    public static void main(String[] args) {

        // 1
        Function<Integer, Boolean> isYearLeap = (Integer year) -> {
            if (year % 4 != 0) {
                return false;
            } else if (year % 400 == 0) {
                return true;
            } else return year % 100 != 0;
        };

        var is2020leap = isYearLeap.apply(2020);
        System.out.println(is2020leap);


        // 2
        BiFunction<Date, Date, Long> daysBetween = (Date date1, Date date2) -> {
            long diffInMilliseconds = Math.abs(date2.getTime() - date1.getTime());
            return TimeUnit.DAYS.convert(diffInMilliseconds, TimeUnit.MILLISECONDS);
        };

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
            Date firstDate = sdf.parse("06/24/2017");
            Date secondDate = sdf.parse("06/30/2017");

            var days = daysBetween.apply(firstDate, secondDate);
            System.out.println(days);
        } catch (ParseException ex) {
            System.out.println("Parse exception");
        }


        // 3
        BiFunction<Date, Date, Long> weeksBetween = (Date date1, Date date2) -> {
            var days = daysBetween.apply(date1, date2);
            return days / 7;
        };

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
            Date firstDate = sdf.parse("05/24/2017");
            Date secondDate = sdf.parse("06/30/2017");

            var weeks = weeksBetween.apply(firstDate, secondDate);
            System.out.println(weeks);
        } catch (ParseException ex) {
            System.out.println("Parse exception");
        }


        // 4
        Function<Date, String> dayOfWeek = (Date date) -> {
            DateFormat formatter = new SimpleDateFormat("EEEE", Locale.ENGLISH);
            return formatter.format(date);
        };
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
            Date date = sdf.parse("06/30/2017");

            var day = dayOfWeek.apply(date);
            System.out.println(day);
        } catch (ParseException ex) {
            System.out.println("Parse exception");
        }
    }
}
