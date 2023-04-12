package ua.step.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Метод isSort должен возвращать истину, если элементы в массиве mas
 * отсортированы в прямом (натуральном) или обратном порядке.
 */
public class Task05
{
    public boolean isSort(int[] mas)
    {
        if(mas == null || mas.length == 0) return false;
        int[] copy = Arrays.stream(mas).sorted().toArray();
        int[] copyReverse = Task00.reverseArray(Arrays.stream(mas).sorted().toArray());
        return Arrays.equals(copy, mas) || Arrays.equals(copyReverse, mas);
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void test01()
    {
        int[] mas = { 1, 2, 3 };
        boolean result = isSort(mas);
        assertTrue(result);
    }

    @Test
    public void test03()
    {
        int[] mas = { 3, 2, 1 };
        boolean result = isSort(mas);
        assertTrue(result);
    }

    @Test
    public void test02()
    {
        int[] mas = { 1, 2 };
        boolean result = isSort(mas);
        assertTrue(result);
    }

    @Test
    public void test04()
    {
        int[] mas = { 5, 3, 1 };
        boolean result = isSort(mas);
        assertTrue(result);
    }

    @Test
    public void test05()
    {
        int[] mas = { 1, 1, 2, 2 };
        boolean result = isSort(mas);
        assertTrue(result);
    }

    @Test
    public void test06()
    {
        int[] mas = { 1 };
        boolean result = isSort(mas);
        assertTrue(result);
    }

    @Test
    public void test07()
    {
        int[] mas = {};
        boolean result = isSort(mas);
        assertFalse(result);
    }

    @Test
    public void test08()
    {
        int[] mas = null;
        boolean result = isSort(mas);
        assertFalse(result);
    }

    @Test
    public void test09()
    {
        int[] mas = { 1, -1, 2 };
        boolean result = isSort(mas);
        assertFalse(result);
    }

    @Test
    public void test10()
    {
        int[] mas = { 0, -1, 1 };
        boolean result = isSort(mas);
        assertFalse(result);
    }

    @Test
    public void test11()
    {
        int[] mas = { 0x0, 00, 0b0 };
        boolean result = isSort(mas);
        assertTrue(result);
    }

    @Test
    public void test12()
    {
        int[] mas = new int[100];
        for (int i = 0; i < mas.length; i++)
        {
            mas[i] = i;
        }
        boolean result = isSort(mas);
        assertTrue(result);
    }

    @Test
    public void test13()
    {
        int[] mas = new int[100];
        for (int i = mas.length-1, j = 0; i > 0; i--, j++)
        {
            mas[j] = i;
        }
        boolean result = isSort(mas);
        assertTrue(result);
    }
}