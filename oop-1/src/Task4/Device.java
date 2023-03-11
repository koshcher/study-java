package Task4;

public abstract class Device {
    private final String name;
    private final double price;

    protected Device(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract void Sound();

    void Show() {
        System.out.println(name);
    }

    void Desc() {
        System.out.println("Price: " + price);
    }
}
