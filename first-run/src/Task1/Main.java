package Task1;

public class Main {
    public static void main(String[] args) {
        String[] lines = {"“Your time is limited,", "so don’t waste it", "living someone else’s life”", "Steve Jobs"};

        for (int i = 0; i < lines.length; ++i) {
            for (int t = 0; t < i; ++t) {
                System.out.print("\t");
            }
            System.out.println(lines[i]);
        }
    }
}