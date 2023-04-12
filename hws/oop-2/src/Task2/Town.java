package Task2;

public class Town {
    long people;

    public Town(long peopleCount) {
        this.people = peopleCount;
    }

    public void sayPeopleCount() {
        System.out.println("People count is " + people);
    }

    public void sayPeopleCount(String message) {
        System.out.println(message + people);
    }
}
