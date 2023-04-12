package Task5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    private static final int MAX_OPTION = 7;
    static Scanner scanner = new Scanner(System.in);
    static Map<Integer, Consumer<Corporation>> optionTasks = new HashMap<>(){{
        put(0, Corporation::show);
        put(1, Main::showByAge);
        put(2, Main::showBySurname);
        put(3, Main::showBySurnameStart);
        put(4, Main::addPerson);
        put(5, Main::removePerson);
        put(6, Main::editPerson);
        put(7, Corporation::save);
    }};


    public static void main(String[] args) {

        System.out.println("Enter path to txt file:");
        var filePath = scanner.nextLine();

        var corporation = new Corporation(filePath);

        // work
        int option;
        do {
            option = chooseOption();
            var task = optionTasks.get(option);
            if(task != null) task.accept(corporation);
        } while (option >= 0 && option <= MAX_OPTION);

        corporation.save();
    }

    public static void showByAge(Corporation corporation) {
        System.out.println("Enter search age:");
        int age = Integer.parseInt(scanner.nextLine());
        corporation.show(age);
    }

    public static void showBySurname(Corporation corporation) {
        System.out.println("Enter search surname:");
        var surname = scanner.nextLine();
        var person = corporation.find(surname);
        person.ifPresent(Person::show);
    }

    public static void showBySurnameStart(Corporation corporation) {
        System.out.println("Enter search surname start:");
        var surname = scanner.nextLine();
        corporation.show(surname);
    }

    public static void addPerson(Corporation corporation) {
        System.out.println("Enter surname:");
        var surname = scanner.nextLine();
        System.out.println("Enter age:");
        var age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter salary:");
        var salary = Integer.parseInt(scanner.nextLine());
        corporation.add(new Person(surname, age, salary));
    }

    public static void removePerson(Corporation corporation) {
        System.out.println("Enter surname:");
        var surname = scanner.nextLine();
        corporation.delete(surname);
    }

    public static void editPerson(Corporation corporation) {
        System.out.println("Enter search surname:");
        var searchSurname = scanner.nextLine();
        System.out.println("Enter new surname:");
        var surname = scanner.nextLine();
        System.out.println("Enter new age:");
        var age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter new salary:");
        var salary = Integer.parseInt(scanner.nextLine());

        corporation.edit(searchSurname, person -> {
            person.age = age;
            person.surname = surname;
            person.salary = salary;
        });
    }

    public static int chooseOption() {
        System.out.println("[0] show whole corporation");
        System.out.println("[1] show by age");
        System.out.println("[2] show by surname");
        System.out.println("[3] show by surname start");
        System.out.println("[4] add person");
        System.out.println("[5] remove person by surname");
        System.out.println("[6] edit person");
        System.out.println("[7] save current state");
        System.out.println("[anything else] end");

        try {
            var choice = Integer.parseInt(scanner.nextLine());
            return choice;
        } catch (Exception ex) {
            return -1;
        }
    }
}
