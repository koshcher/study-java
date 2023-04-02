package Task5;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Person {
    public String surname;
    public int age;
    public int salary;

    public Person(String surname, int age, int salary) {
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public static Person parse(BufferedReader reader) throws IOException {
        var surname = reader.readLine();
        var age = Integer.parseInt(reader.readLine());
        var salary = Integer.parseInt(reader.readLine());

        return new Person(surname, age, salary);
    }

    public String stringify() {
        return surname + "\n" + age + "\n" + salary + "\n";
    }

    public void show() {
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
