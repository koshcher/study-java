package Task6;

import java.time.Year;
import java.util.Scanner;

public class Automobile {
    private String name;
    private String manufactureName;
    private int year;
    private int engineSize;

    public Automobile(String name, String manufactureName, int year, int engineSize) {
        this.engineSize = engineSize;
        this.name = name;
        this.year = year;
        this.manufactureName = manufactureName;
    }

    public Automobile(String name, String manufactureName, int engineSize) {
        this.engineSize = engineSize;
        this.name = name;
        this.year = Year.now().getValue();
        this.manufactureName = manufactureName;
    }

    public void output() {
        System.out.println("Name: " + name + ", manufacture name: " +manufactureName + ", year: " + year + ", engine size: "
                + engineSize);
    }

    public void  input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name = scanner.nextLine();

        System.out.println("Enter manufacture name: ");
        this.manufactureName = scanner.nextLine();

        System.out.println("Enter year: ");
        this.year = scanner.nextInt();

        System.out.println("Enter engine size: ");
        this.engineSize = scanner.nextInt();

    }
}
