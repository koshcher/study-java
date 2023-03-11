package Task4;

public class Automobile extends Device {
    protected Automobile() {
        super("Automobile", 500_000);
    }

    @Override
    void Sound() {
        System.out.println("Brrr Brrr Brrrrrrrrrrrrrrrrrrr");
    }
}
