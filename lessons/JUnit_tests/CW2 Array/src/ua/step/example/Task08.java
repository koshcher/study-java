package ua.step.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Метод putChess должен заполнять двухмерный массив еденицами в шахматном
 * порядке. Левый верхний угол всегда содержит еденицу. Если в метод передается
 * null, метод ничего не делаетю
 */
public class Task08
{
    public void putChess(int[][] mas1)
    {
        if(mas1 == null) return;

        for (int i = 0; i < mas1.length; i++) {
            int[] row = mas1[i];
            for (int j = i % 2 == 0 ? 0 : 1; j < row.length; j+=2) {
                row[j] = 1;
            }
        }
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ 
     */

    @Test
    public void testNull()
    {
        int[][] mas = null;
        putChess(mas);
        assertNull(mas);
    }

    @Test
    public void test00()
    {
        int[][] mas = new int[1][1];
        putChess(mas);
        assertArrayEquals(mas, new int[][] { 
            { 1 } 
        });
    }
    
    @Test
    public void test01()
    {
        int[][] mas = new int[2][2];
        putChess(mas);
        assertArrayEquals(mas, new int[][] { 
            { 1, 0 }, 
            { 0, 1 } 
        });
    }

    @Test
    public void test02()
    {
        int[][] mas = new int[3][3];
        putChess(mas);
        assertArrayEquals(mas, new int[][] { 
            { 1, 0, 1 }, 
            { 0, 1, 0 },
            { 1, 0, 1 }, 
        });
    }

    @Test
    public void test03()
    {
        int[][] mas = new int[2][3];
        putChess(mas);
        assertArrayEquals(mas, new int[][] { 
            { 1, 0, 1 }, 
            { 0, 1, 0 }
        });
    }
    
    @Test
    public void test04()
    {
        int[][] mas = new int[3][2];
        putChess(mas);
        assertArrayEquals(mas, new int[][] { 
            { 1, 0 }, 
            { 0, 1 },
            { 1, 0 },
        });
    }

    @Test
    public void test06()
    {
        int[][] mas = new int[1][2];
        putChess(mas);
        assertArrayEquals(mas, new int[][] { 
            { 1, 0 }, 
        });
    }
    
    @Test
    public void test07()
    {
        int[][] mas = new int[1][1];
        putChess(mas);
        assertArrayEquals(mas, new int[][] { 
            { 1 } 
        });
    }
    @Test
    public void test08()
    {
        int[][] mas = new int[4][4];
        putChess(mas);
        assertArrayEquals(mas, new int[][] { 
            { 1, 0, 1, 0 }, 
            { 0, 1, 0, 1 },
            { 1, 0, 1, 0 }, 
            { 0, 1, 0, 1 },
        });
    }
}