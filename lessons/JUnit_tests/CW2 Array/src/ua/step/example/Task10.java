package ua.step.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * Метод getSumIndex должен вернуть двухмерный массив размером col на row.
 * Значение каждого элемента должна быть равна сумме индексов элемента массива.
 * Если значение входных параметров col или row меньши либо равны 0 метод должен
 * вернуть null.
 */
public class Task10
{
    public int[][] getSumIndex(int col, int row)
    {
        if(col <= 0 || row <= 0) return null;

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = i + j;
            }
        }
        return matrix;
    }
    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ 
     */

    @Test
    public void testWrongSize()
    {
        int[][] result = getSumIndex(0, 1);
        assertNull(result);
        result = getSumIndex(2, 0);
        assertNull(result);
        result = getSumIndex(-1, 2);
        assertNull(result);
        result = getSumIndex(2, -2);
        assertNull(result);
    }

    @Test
    public void testSize()
    {
        int[][] result = getSumIndex(2, 2);
        assertSame(result.length, 2);
        for (int[] mas : result)
        {
            assertSame(mas.length, 2);
        }
    }
    
    // метод должен выполниться за две милисекунды
    @Test(timeout = 2)
    public void testResult2x2()
    {
        int[][] result = getSumIndex(2, 2);
        assertArrayEquals(new int[][] { 
            { 0, 1 }, 
            { 1, 2 } 
          }
        , result );
    }

    @Test(timeout = 1)
    public void testResult3x3()
    {
        int[][] result = getSumIndex(3, 3);
        assertArrayEquals(new int[][] { 
            { 0, 1, 2 },
            { 1, 2, 3 },
            { 2, 3, 4 }
          }
        , result);
    }

    @Test
    public void testResult4x4()
    {
        int[][] result = getSumIndex(4, 4);
        assertArrayEquals(new int[][] { 
            { 0, 1, 2, 3 },
            { 1, 2, 3, 4 },
            { 2, 3, 4, 5 },
            { 3, 4, 5, 6 }
          }
        , result);
    }

    @Test(timeout = 7)
    public void testResult1000x1000()
    {
        int[][] result = getSumIndex(1000, 1000);
        assertNotNull(result);
    }
}