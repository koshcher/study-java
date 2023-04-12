package Task3;

public class Money {
    // dollars, euros, hryvnias
    protected long integerPart;

    // cents, euro cents, kopecks
    protected double fractionalPart;


    public void setFractionalPart(double fractionalPart) {
        this.fractionalPart = fractionalPart;
    }

    public void setIntegerPart(long integerPart) {
        this.integerPart = integerPart;
    }

    public void Show() {
        System.out.println("You have integer:" + integerPart + " and fractional:" + fractionalPart);
    }
}
