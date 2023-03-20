package ua.step.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.Arrays;

import org.junit.Test;

/**
 * Метод getMax должен возвращать значение максимального элемента массива mas
 * или -1 если массив null или на 0 элементов
 */
public class Task03
{
    public int getMax(int[] mas)
    {
        if(mas == null || mas.length == 0) return  -1;

        return Arrays.stream(mas).max().getAsInt();
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void testNull()
    {
        int[] mas = null;
        int result = getMax(mas);
        assertSame(-1, result);
    }

    @Test
    public void testEmpty()
    {
        int[] mas = {};
        int result = getMax(mas);
        assertSame(-1, result);
    }

    @Test
    public void test02()
    {
        int[] mas = { 1, 2, 3 };
        int result = getMax(mas);
        assertSame(3, result);
    }

    @Test
    public void test03()
    {
        int[] mas = { 100, 10, 1 };
        int result = getMax(mas);
        assertSame(100, result);
    }

    @Test
    public void test04()
    {
        int[] mas = { 9, 99, 999, 9999 };
        int result = getMax(mas);
        assertEquals(9999, result);
    }

    @Test
    public void test05()
    {
        int[] mas = { -2, -1, -3, -4, -999 };
        int result = getMax(mas);
        assertSame(-1, result);
    }

    @Test
    public void test06()
    {
        int[] mas = { 1 };
        int result = getMax(mas);
        assertSame(1, result);
    }
}