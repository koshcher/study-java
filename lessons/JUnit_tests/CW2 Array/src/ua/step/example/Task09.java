package ua.step.example;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Метод putWave должен заполнять двухмерный массив mas1 числами, которые
 * увеличиваются на 1 в направлении от левого верхнего угла к правому нижнему. 
 * Если на вход метода поступает null, метод ничего не делает.  
 */
public class Task09
{
    public void putWave(int[][] mas1)
    {
        if(mas1 == null) return;
        int length = mas1.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                mas1[i][j] = i+1;
                mas1[j][i] = i+1;
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
        putWave(mas);
        assertArrayEquals(mas, null);
    }

    @Test
    public void test00()
    {
        int[][] mas = new int[1][1];
        putWave(mas);
        assertArrayEquals(mas, new int[][] { 
            { 1 }, 
        });
    }
    
    @Test
    public void test01()
    {
        int[][] mas = new int[2][2];
        putWave(mas);
        assertArrayEquals(mas, new int[][] { 
            { 1, 2 }, 
            { 2, 2 } 
        });
    }

    @Test
    public void test02()
    {
        int[][] mas = new int[3][3];
        putWave(mas);
        assertArrayEquals(mas, new int[][] { 
            { 1, 2, 3 }, 
            { 2, 2, 3 }, 
            { 3, 3, 3},
        });
    }
    
    @Test
    public void test04()
    {
        int[][] mas = new int[4][4];
        putWave(mas);
        assertArrayEquals(mas, new int[][] { 
            { 1, 2, 3, 4 }, 
            { 2, 2, 3, 4 }, 
            { 3, 3, 3, 4 },
            { 4, 4, 4, 4 }, 
        });
    }
    
    @Test
    public void test05()
    {
        int[][] mas = new int[5][5];
        putWave(mas);
        assertArrayEquals(mas, new int[][] { 
            { 1, 2, 3, 4, 5 }, 
            { 2, 2, 3, 4, 5 }, 
            { 3, 3, 3, 4, 5 },
            { 4, 4, 4, 4, 5 }, 
            { 5, 5, 5, 5, 5 },
        });
    }
}