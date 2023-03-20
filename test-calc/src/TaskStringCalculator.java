import org.junit.Test;
import static org.junit.Assert.*;

public class TaskStringCalculator {

    @Test
    public void testIsNull(){
        String source = null;
        int res = StringCalculator.add(source);
        assertEquals(0, res);
    }

    @Test
    public void testIsEmpty(){
        String source = "";
        int res = StringCalculator.add(source);
        assertEquals(0, res);
    }

    @Test
    public void test1(){
        String source = "1";
        int res = StringCalculator.add(source);
        assertEquals(1, res);
    }

    @Test
    public void test12(){
        String source = "1,2";
        int res = StringCalculator.add(source);
        assertEquals(3, res);
    }

    @Test
    public void test4comma(){
        String source = "4,";
        int res = StringCalculator.add(source);
        assertEquals(4, res);
    }

    // KATA 2
    @Test
    public void test123space(){
        String source = "1,2,3, ";
        int res = StringCalculator.add(source);
        assertEquals(6, res);
    }

    // KATA 3
    @Test
    public void test1n2n3space(){
        String source = "1\n2\n3, ";
        int res = StringCalculator.add(source);
        assertEquals(6, res);
    }

    // KATA 4
    @Test
    public void test11001(){
        String source = "1, 1001";
        int res = StringCalculator.add(source);
        assertEquals(1, res);
    }

    // KATA 5
    @Test
    public void testCustomSeparator(){
        String source = "//#\n1#2 ";
        int res = StringCalculator.add(source);
        assertEquals(3  , res);
    }

    // KATA 6
    @Test
    public void testStar(){
        String source = "//*\n1*2 ";
        int res = StringCalculator.add(source);
        assertEquals(3  , res);
    }

    @Test
    public void testThreeStar(){
        String source = "//[***]\n1 *** 2 *** 3";
        int res = StringCalculator.add(source);
        assertEquals(6  , res);
    }
}
