package Task5;

import java.io.*;
import java.util.*;
import java.util.function.Consumer;

public class Corporation {
    private final String path;
    private List<Person> people;

    public Corporation(String path) {
        this.path = path;
        load();
    }

    public void show() {
        System.out.println("People in corporation");
        people.forEach(Person::show);
    }

    public void delete(String surname) {
        var person = people.stream()
                .filter(p -> Objects.equals(p.surname, surname))
                .findFirst();

        if(person.isEmpty()) return;
        people.remove(person.get());
    }

    public void edit(String searchSurname, Consumer<Person> mutation) {
        var person = people.stream()
                .filter(p -> Objects.equals(p.surname, searchSurname))
                .findFirst();

        if(person.isEmpty()) return;
        mutation.accept(person.get());
    }

    public void add(Person person) {
        people.add(person);
    }

    public Optional<Person> find(String surname) {
        return people.stream()
                .filter(p -> Objects.equals(p.surname, surname))
                .findFirst();
    }

    public void show(String surnameStart) {
        var person = people.stream()
                .filter(p -> p.surname.startsWith(surnameStart))
                .findFirst();

        if(person.isEmpty()) {
            System.out.println("Person isn't found");
            return;
        }

        person.get().show();
    }

    public void show(int age) {
        var person = people.stream()
                .filter(p -> p.age == age)
                .findFirst();

        if(person.isEmpty()) {
            System.out.println("Person isn't found");
            return;
        }

        person.get().show();
    }

    private void load() {
        try {
            var reader = new BufferedReader(new FileReader(path));

            var currentLine = reader.readLine();
            if(currentLine == null) throw new NoSuchFieldException();

            // fist string is meta
            var listLength = Integer.parseInt(currentLine);
            people = new ArrayList<>(listLength);

            for (int i = 0; i < listLength; i++) {
                people.add(Person.parse(reader));
            }

            reader.close();
        } catch (Exception exception) {
            if(people != null) people = new ArrayList<>();
        }
    }

    public void save() {
        try {
            var writer = new BufferedWriter(new FileWriter(path));
            writer.write(String.valueOf(people.size()));
            writer.newLine();
            for (var person:people) writer.write(person.stringify());
            writer.close();
        } catch (Exception exception) {
            if(people != null) people = new ArrayList<>();
        }
    }
}
