package ua.step.example.part00.practica;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Практика
 * Метод getEven должен возвращать новый массив в котором содержатся все четные
 * числа из исходного массива mas. Если четных чисел в массиве нет, метод должен
 * возвращать null.
 */
public class Task02
{
    // FIXME исправьте метод, чтобы все тесты проходили
    public int[] getEven(int[] mas)
    {
        int count = 0;
        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i] % 2 == 0)
            {
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++)
        {
            for (int j = 0; j < mas.length; j++)
            {
                if (mas[j] % 2 == 0)
                {
                    result[i] = mas[j];
                }
            }
        }
        return result;
    }

    @Test
    public void testEvenExist()
    {
        int[] input = { 1, 2 };
        int[] result = getEven(input);
        assertArrayEquals(new int[] { 2 }, result);
    }

    @Test
    public void testNotNull()
    {
        int[] input = { 1, 2 };
        int[] result = getEven(input);
        assertNotNull(result);
    }

    @Test
    public void testTwoEvenExist()
    {
        int[] input = { 1, 2, 3, 4 };
        int[] result = getEven(input);
        // проверяет чтоб исхожный массив не был изменен методом getEven
        assertArrayEquals(new int[]{ 1, 2, 3, 4 }, input);
        // проверяет результат работы метода getEven
        assertArrayEquals(new int[] { 2, 4 }, result);
    }

    @Test
    public void testEvenNotExist()
    {
        int[] input = { 1, 3 };
        int[] result = getEven(input);
        assertNull(result);
    }
}