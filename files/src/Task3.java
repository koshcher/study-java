import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter path to txt file:");
        var filePath = scanner.nextLine();

        var arraysLoad = load(filePath);

        if(arraysLoad.isEmpty()) {
            System.out.println("Can't load arrays");
            return;
        }

        var arrays = arraysLoad.get();
        showInfo(arrays);
    }

    public static void showInfo(List<List<Integer>> arrays) {

        Optional<Integer> generalMax = Optional.empty();
        Optional<Integer> generalMin = Optional.empty();
        Integer generalSum = 0;

        for (var array: arrays) {
            System.out.print("Array: ");
            array.forEach(num -> System.out.print(num + " "));
            System.out.println();

            var arrayMax =  max(array);
            if(arrayMax.isEmpty()) {
                System.out.println("There isn't max element");
            } else {
              if(generalMax.isEmpty() || arrayMax.get() > generalMax.get())  {
                  generalMax = arrayMax;
              }
              System.out.println("Max: " + generalMax.get());
            }

            var arrayMin = min(array);
            if(arrayMin.isEmpty()) {
                System.out.println("There isn't min element");
            } else {
                if(generalMin.isEmpty() || arrayMin.get() < generalMin.get())  {
                    generalMin = arrayMin;
                }
                System.out.println("Min: " + generalMin.get());
            }

            var arraySum = sum(array);
            generalSum += arraySum;
            System.out.println("Sum: " + arraySum);

            System.out.println("----------------------------");
        }

        System.out.println(generalMax.isEmpty() ? "There isn't max value" : "General max: " + generalMax.get());
        System.out.println(generalMin.isEmpty() ? "There isn't min value" : "General min: " + generalMin.get());
        System.out.println("General sum: " + generalSum);
    }


    public static Optional<Integer> min(List<Integer> array) {
        return array.stream().min(Integer::compareTo);
    }

    public static Integer sum(List<Integer> array) {
        return array.stream().reduce(0, Integer::sum);
    }

    public static Optional<Integer> max(List<Integer> array) {
        return array.stream().max(Integer::compareTo);
    }

    public static Optional<List<List<Integer>>> load(String filePath) {
        try {
            List<List<Integer>> arrays = new LinkedList<>();
            BufferedReader firstFileReader = new BufferedReader(new FileReader(filePath));

            var currentString = firstFileReader.readLine();

            while (currentString != null) {
                var array = Arrays
                        .stream(currentString.split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

                arrays.add(array);
                currentString = firstFileReader.readLine();
            }

            return Optional.of(arrays);
        } catch (Exception exception) {
            return Optional.empty();
        }
    }
}
