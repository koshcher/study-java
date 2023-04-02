import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter path to txt file:");
        var firstFile = scanner.nextLine();


        try {
            BufferedReader firstFileReader = new BufferedReader(new FileReader(firstFile));

            var currentString = firstFileReader.readLine();
            if(currentString == null) {
                System.out.println("File is empty");
                return;
            }

            var longestString = currentString;

            while (currentString != null) {

                if(currentString.length() > longestString.length()) {
                    longestString = currentString;
                }

                currentString = firstFileReader.readLine();
            }

            System.out.println("Longest string:");
            System.out.println(longestString);
            System.out.println("Length: " + longestString.length());
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
