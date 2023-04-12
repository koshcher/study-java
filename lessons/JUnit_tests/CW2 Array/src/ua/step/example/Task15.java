package ua.step.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Метод isCute проверяет двухмерный массив на квадраты. Метод должен возвращать
 * false если в ней нет ни одного квадрата 2 на 2, заполненного целиком нулями
 * или целиком единицами, если же есть возвращать истину.
 */
public class Task15
{
    public boolean isCute(int[][] mas)
    {
        if(mas == null || mas.length < 2 || mas[0] == null || mas[0].length < 2) return false;

        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 0; j < mas[i].length - 1; j++) {
                int el =  mas[i][j];
                if(mas[i][j+1] == el && mas[i+1][j] == el && mas[i+1][j+1] == el) return true;
            }
        }

        return false;
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void testNull()
    {
        int[][] mas = null;
        boolean result = isCute(mas);
        assertFalse(result);
    }

    @Test
    public void testFalseInit()
    {
        int[][] mas = new int[2][];
        boolean result = isCute(mas);
        assertFalse(result);
    }

    @Test
    public void testOne()
    {
        int[][] mas = new int[1][1];
        boolean result = isCute(mas);
        assertFalse(result);
    }
    
    @Test
    public void test4on4False()
    {
        int[][] mas = new int[][] {
            {0,1,0,1},
            {1,0,1,0},
            {0,1,0,1},
            {1,0,1,0},
        };
        boolean result = isCute(mas);
        assertFalse(result);
    }
    
    @Test
    public void testTwo()
    {
        int[][] mas = new int[2][2];
        boolean result = isCute(mas);
        assertTrue(result);
    }
    
    @Test
    public void test4on4Zero()
    {
        int[][] mas = new int[][] {
            {0,0,1,0},
            {0,0,1,0},
            {1,0,1,0},
            {0,1,0,1},
        };
        boolean result = isCute(mas);
        assertTrue(result);
    }
    
    @Test
    public void test4on4One()
    {
        int[][] mas = new int[][] {
            {1,1,1,1},
            {1,0,0,1},
            {1,0,0,1},
            {1,1,1,1},
        };
        boolean result = isCute(mas);
        assertTrue(result);
    }
    
    @Test
    public void test4on4Thre()
    {
        int[][] mas = new int[][] {
            {1,1,1,1},
            {1,0,0,1},
            {1,0,1,1},
            {1,1,1,1},
        };
        boolean result = isCute(mas);
        assertTrue(result);
    }
}