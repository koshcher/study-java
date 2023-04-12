package Task2;

// testing hard parts
public class Test {

    /*
        Enter rows count:
        2
        Enter cols count :
        3
        1
        5
        -4
        6
        9
        -5
        Enter rows count:
        3
        Enter cols count :
        2
        2
        4
        -3
        7
        1
        -3
        ------------------
        1 5 -4
        6 9 -5
        ------------------
        2 4
        -3 7
        1 -3
        ------------------
        -17 51
        -20 102
     */

    public static void main(String[] args) {

        var m1 = new Matrix();
        m1.input();
        var m2 = new Matrix();
        m2.input();

        System.out.println("------------------");
        m1.show();
        System.out.println("------------------");
        m2.show();
        System.out.println("------------------");

        var mult = m1.multiplication(m2);
        mult.ifPresent(Matrix::show);
    }
}
