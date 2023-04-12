import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter path to txt file:");
        var filePath = scanner.nextLine();

        var nums = inputNums(scanner);

        if(nums.isEmpty()) {
            System.out.println("Can't parse file");
            return;
        }

        save(nums.get(), filePath);
    }

    public static void save(List<Integer> nums, String path) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));


            writer.append(nums.stream().map(String::valueOf).collect(Collectors.joining(" ")));
            writer.newLine();

            String even = nums.stream().filter(n -> n%2==0).map(String::valueOf).collect(Collectors.joining(" "));
            writer.append(even);
            writer.newLine();

            String odd = nums.stream().filter(n -> n%2!=0).map(String::valueOf).collect(Collectors.joining(" "));
            writer.append(odd);
            writer.newLine();

            writer.append(nums.stream().sorted(Collections.reverseOrder()).map(String::valueOf).collect(Collectors.joining(" ")));
            writer.newLine();

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Optional<List<Integer>> inputNums(Scanner scanner) {
        try {
            System.out.println("Enter nums seperated with space, like: 10 5 1 -2");

            var numsStr = scanner.nextLine();
            var nums = Arrays
                    .stream(numsStr.split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            return Optional.of(nums);
        } catch (Exception exception) {
            return Optional.empty();
        }
    }
}
