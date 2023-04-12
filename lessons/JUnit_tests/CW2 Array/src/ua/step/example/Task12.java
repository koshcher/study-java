package ua.step.example;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * Метод getEightQueensArray должен возврвшать двухмерный квадратный массив
 * размером 8×8 который заполнен нулями и единицами таким образом, чтобы сумма
 * всех элементов массива была равна 8, при этом сумма элементов ни в одном
 * столбце, строке или диагональном ряде матрицы не превышала единицы».
 */
public class Task12
{
    public int[][] getEightQueensArray()
    {
        int[][] matrix = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = 0;
            }
        }

        matrix[0][0] =1;
        matrix[7][1]=1;
        matrix[1][2] =1;
        matrix[6][3]=1;
        matrix[2][4]=1;
        matrix[3][5]=1;
        matrix[5][6]=1;
        matrix[4][7]=1;
        return matrix;
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ 
     */

    @Test
    public void testNullCol()
    {
        int[][] result = getEightQueensArray();
        assertNotNull(result);
        for (int[] row : result)
        {
            assertNotNull(row);
        }
    }

    @Test
    public void testSizeCol()
    {
        int[][] result = getEightQueensArray();
        assertSame(result.length, 8);
    }

    @Test
    public void testSizeRow()
    {
        int[][] result = getEightQueensArray();
        for (int[] row : result)
        {
            assertSame(row.length, 8);
        }
    }

    @Test
    public void testRezultAllSum()
    {
        int[][] result = getEightQueensArray();
        int sum = 0;
        for (int i = 0; i < result.length; i++)
        {
            for (int j = 0; j < result[i].length; j++)
            {
                sum += result[i][j];
            }
        }
        assertSame(sum, 8);
    }

    @Test
    public void testRezultColSum()
    {
        int[][] result = getEightQueensArray();

        for (int i = 0; i < result.length; i++)
        {
            int sum = 0;
            for (int j = 0; j < result[i].length; j++)
            {
                sum += result[j][i];
            }
            assertSame(sum, 1);
        }
    }

    @Test
    public void testRezultRow()
    {
        int[][] result = getEightQueensArray();

        for (int i = 0; i < result.length; i++)
        {
            int sum = 0;
            for (int j = 0; j < result.length; j++)
            {
                sum += result[i][j];
            }
            assertSame(sum, 1);
        }
    }

    @Test
    public void testRezultDioganalSum()
    {
        int[][] result = getEightQueensArray();
        int sum = 0;
        for (int i = 0; i < result.length; i++)
        {
            sum += result[i][i];
        }
        assertSame(sum, 1);
    }
}