package Task3;

import java.util.LinkedList;
import java.util.Objects;

/*
    1. Полная распечатка базы данных;
    2. Распечатка данных по конкретному коду;
    3. Распечатка данных по конкретному типу штрафа;
    4. Распечатка данных по конкретному городу;
    5. Добавление нового человека с информацией о нем;
    6. Добавление новых штрафов для существующей записи;
    7. Удаление штрафа;
    8. Замена информации о человеке и его штрафах
 */

public class TaxInspectionDatabase {
    private LinkedList<Person> db = new LinkedList<>();

    public void show(){
        for (Person person:db) {
            System.out.println("Person: " + person.id + " " + person.name + " " + person.age + "y.o.");

            for (var fine: person.fines) {
                System.out.println("Fine: " + fine.fineType + " town: " + fine.town);
            }
        }
    }

    public void show(String id) {
        var person = db.stream().filter(p -> p.id == id).findFirst().orElse(null);
        if(person == null) return;
        for (var fine: person.fines) {
            System.out.println("Fine: " + fine.fineType + " town: " + fine.town);
        }
    }

    public void showByType(String type) {
        db.forEach(p -> {
            p.fines.stream().filter(f -> Objects.equals(f.fineType, type)).forEach(fine -> {
                System.out.println("Fine: " + fine.fineType + " town: " + fine.town);
            });
        });
    }


    public void showByTown(String town) {
        db.forEach(p -> {
            p.fines.stream().filter(f -> Objects.equals(f.town, town)).forEach(fine -> {
                System.out.println("Fine: " + fine.fineType + " town: " + fine.town);
            });
        });
    }

    public void addPerson(Person person) {
        db.add(person);
    }

    public void addFine(String personId, Fine fine) {
        var person = db.stream().filter(p -> p.id == personId).findFirst().orElse(null);
        if(person == null) return;
        person.fines.add(fine);
    }

    public void deleteFine(String personId, Fine fine) {
        var person = db.stream().filter(p -> p.id == personId).findFirst().orElse(null);
        if(person == null) return;
        person.fines.remove(fine);
    }

    public void changePersonInfo(String personId, String name, int age) {
        var person = db.stream().filter(p -> p.id == personId).findFirst().orElse(null);
        if(person == null) return;
        person.age = age;
        person.name = name;
    }
}
