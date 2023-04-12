package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter path to a existed directory:");
        var existDirectoryPath = scanner.nextLine();

        System.out.println("Enter path to a new directory:");
        var newDirectoryPath = scanner.nextLine();

        var copier = new Copier(existDirectoryPath, newDirectoryPath);
        Thread copyThread = new Thread(copier);
        copyThread.start();
    }
}
