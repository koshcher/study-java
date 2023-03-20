package ua.step.example.part00.practica;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Практика:
 * Метод isNegativeExist возвращает истину, если в массиве есть хотя бы
 * одно отрицательное значение
 */
public class Task00
{
    // FIXME исправьте метод, чтобы все тесты проходили
    public boolean isNegativeExist(int[] mas)
    {
        return false;
    }

    @Test
    public void testNegativeExist()
    {
        int[] input = { 1, -1 };
        boolean result = isNegativeExist(input);
        assertTrue(result);
    }

    @Test
    public void testTwoNegativeExist()
    {
        int[] input = { -1, -1 };
        boolean result = isNegativeExist(input);
        assertTrue(result);
    }

    @Test
    public void testNegativNotExist()
    {
        int[] input = { 1, 2 };
        boolean result = isNegativeExist(input);
        assertFalse(result);
    }

    @Test
    public void testEmptyArray()
    {
        int[] input = {};
        boolean result = isNegativeExist(input);
        assertFalse(result);
    }

    @Test
    public void testArrayIsNull()
    {
        int[] input = null;
        boolean result = isNegativeExist(input);
        assertFalse(result);
    }
}