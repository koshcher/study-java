package ua.step.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;

/**
 * Метод isBalance дожен возврашать true, если сумма положительных и
 * отрицательных значений в входном массиве mas равна по модулю, иначе должен
 * возврашать false.
 */
public class Task02
{
    private boolean isBalance(int[] mas)
    {
        if(mas == null) return false;
        return Arrays.stream(mas).sum() == 0;

    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void test00()
    {
        boolean result = isBalance(null);
        assertFalse(result);
    }

    @Test
    public void test01()
    {
        int[] input = { 1, 1 };
        boolean result = isBalance(input);
        assertFalse(result);
    }

    @Test
    public void test02()
    {
        int[] input = { -1, 1 };
        boolean result = isBalance(input);
        assertTrue(result);
    }

    @Test
    public void test03()
    {
        int[] input = { 1, -1 };
        boolean result = isBalance(input);
        assertTrue(result);
    }

    @Test
    public void test04()
    {
        int[] input = { -2, 0, -1, 3 };
        boolean result = isBalance(input);
        assertTrue(result);
    }

    @Test
    public void test05()
    {
        int[] input = { -2, -2 };
        boolean result = isBalance(input);
        assertFalse(result);
    }

    @Test
    public void test06()
    {
        int[] input = { 1, 2, 3, -6 };
        boolean result = isBalance(input);
        assertTrue(result);
    }
    
    @Test
    public void test07()
    {
        int[] input = { 1, -2 };
        boolean result = isBalance(input);
        assertFalse(result);
    }
}
