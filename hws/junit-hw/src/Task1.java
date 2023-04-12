import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task1 {

    private double ctg(double rads) {
        return 1.0 / Math.tan(rads);
    }

    public double rightFigureSquare(double sideLength, int countOfSides) {
        return countOfSides * sideLength * sideLength * ctg(Math.PI / countOfSides)  / 4;
    }

    public double rectangleSquare(double a, double b) {
        return a * b;
    }

    public double diamondSquare(double diagonal1, double diagonal2) {
        return diagonal1 * diagonal2 / 2;
    }

    @Test
    public void testSquare() {
        double res = rightFigureSquare(7, 4);
        System.out.println(res);
        assertEquals(49.0, res, 0.001);
    }

    @Test
    public void testHexagon() {
        double res = rightFigureSquare(9, 6);
        System.out.println(res);
        assertEquals(210.44417, res, 0.001);
    }

    @Test
    public void testTriangle() {
        double res = rightFigureSquare(5, 3);
        System.out.println(res);
        assertEquals(10.82532, res, 0.001);
    }

    @Test
    public void testRectangle() {
        double res = rectangleSquare(5, 3);
        System.out.println(res);
        assertEquals(15, res, 0.001);
    }

    @Test
    public void testDiamond() {
        double res = diamondSquare(5, 8);
        System.out.println(res);
        assertEquals(20, res, 0.001);
    }

}
