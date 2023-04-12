package Task11;

import java.util.function.Consumer;


/**
 * Best task
 */
public class Main {
    enum Direction {
        Horizontal,
        Vertical
    }

    public static void drawLine(int length, char symbol, Direction direction) {
        final Consumer<Character> print = (direction == Direction.Horizontal)
                ? (Character c) -> System.out.print(c)
                : (Character c) -> System.out.println(c);

        for (int i = 0; i < length; ++i) print.accept(symbol);
    }

    public static void main(String[] args){
        try {
            drawLine(5, '|', Direction.Vertical);
            System.out.println();
            drawLine(12, '-', Direction.Horizontal);
        } catch (Exception ex)  {
            System.out.print("Input is'n correct");
        }
    }
}
