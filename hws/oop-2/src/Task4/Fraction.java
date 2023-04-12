package Task4;

public class Fraction {
    long up;
    long down;

    public Fraction(long upperPart, long downPart) {
        up = upperPart;
        down = downPart;
    }

    public double toDouble() {
        return 1.0 * up / down;
    }

    public void show() {
        String upStr = String.valueOf(up);
        String downStr = String.valueOf(down);
        int maxLength = Math.max(upStr.length(), downStr.length());

        System.out.println(upStr);
        for (int i = 0; i < maxLength; i++) {
            System.out.print("-");
        }
        System.out.println("\n" + downStr);
    }

    public void show(boolean asDouble) {
        String message = asDouble ? String.valueOf(toDouble()) : up + "/" + down;
        System.out.println(message);
    }
}
