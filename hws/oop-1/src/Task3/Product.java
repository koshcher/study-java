package Task3;

public class Product extends Money {
    public void DecreasePrice(int integerPart, int fractionalPart) {
        integerPart -= integerPart;
        fractionalPart -= fractionalPart;
    }
}
