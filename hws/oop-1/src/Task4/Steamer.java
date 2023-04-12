package Task4;

public class Steamer extends Device {
    protected Steamer() {
        super("Steamer", 2_300_000);
    }

    @Override
    void Sound() {
        System.out.println("Tuuuu tuuuu tuuuu tuuu");
    }
}
