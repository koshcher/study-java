import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter path to first txt file:");
        var firstFile = scanner.nextLine();

        System.out.println("Enter path to second txt file:");
        var secondFile = scanner.nextLine();

        try {
            BufferedReader firstFileReader = new BufferedReader(new FileReader(firstFile));
            BufferedReader secondFileReader = new BufferedReader(new FileReader(secondFile));

            String firstFileLine;
            String secondFileLine;

            do {
                firstFileLine = firstFileReader.readLine();
                secondFileLine = secondFileReader.readLine();

                if(!Objects.equals(firstFileLine, secondFileLine)) {
                    System.out.println("Different lines:");

                    if(firstFileLine != null) System.out.println(firstFileLine);
                    if(secondFileLine != null) System.out.println(secondFileLine);
                }

            } while (firstFileLine != null && secondFileLine != null);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
