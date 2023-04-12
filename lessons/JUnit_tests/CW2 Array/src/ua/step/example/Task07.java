package ua.step.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;

/**
 * Метод isRandomEquals должен возврашать истину, если все уникальные значения
 * из массива mas1 содержатся в массиве mas2.
 * 
 * Подсказка: Используй метод Arrays.binarySearch для поиска в массиве
 */
public class Task07
{
    public boolean isRandomEquals(int[] mas1, int[] mas2)
    {
        if(mas1 == null || mas2 == null) return false;

        Arrays.sort(mas2);

        for (int num1:mas1) {
            if(Arrays.binarySearch(mas2, num1) < 0) return false;
        }
        return true;
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void test01()
    {
        boolean result = isRandomEquals(null, null);
        assertFalse(result);
    }

    @Test
    public void test02()
    {
        int[] mas1 = { 1, 2 };
        boolean result = isRandomEquals(mas1, null);
        assertFalse(result);
    }

    @Test
    public void test03()
    {
        int[] mas1 = { 1, 2 };
        boolean result = isRandomEquals(null, mas1);
        assertFalse(result);
    }

    @Test
    public void test04()
    {
        int[] mas1 = { 1, 2 };
        int[] mas2 = { 1, 2 };
        boolean result = isRandomEquals(mas1, mas2);
        assertTrue(result);
    }

    @Test
    public void test05()
    {
        int[] mas1 = { 2, 2 };
        int[] mas2 = { 2 };
        boolean result = isRandomEquals(mas1, mas2);
        assertTrue(result);
    }

    @Test
    public void test06()
    {
        int[] mas1 = { 2, 2 };
        int[] mas2 = { 2, 1 };
        boolean result = isRandomEquals(mas1, mas2);
        assertTrue(result);
    }

    @Test
    public void test07()
    {
        int[] mas1 = { 1, 5, 3 };
        int[] mas2 = { 3, 1, 5 };
        boolean result = isRandomEquals(mas1, mas2);
        assertTrue(result);
    }

    @Test
    public void test08()
    {
        int[] mas1 = { 1, 1 };
        int[] mas2 = { 1, 1, 1 };
        boolean result = isRandomEquals(mas1, mas2);
        assertTrue(result);
    }

    @Test
    public void test09()
    {
        int[] mas1 = { 1, 1, 1 };
        int[] mas2 = { 1, 1 };
        boolean result = isRandomEquals(mas1, mas2);
        assertTrue(result);
    }

    @Test
    public void test10()
    {
        int[] mas1 = { 1, 2, 3 };
        int[] mas2 = { 1, 2 };
        boolean result = isRandomEquals(mas1, mas2);
        assertFalse(result);
    }

    @Test
    public void test11()
    {
        int[] mas1 = { 7, 6 };
        int[] mas2 = { 6, 6, 6 };
        boolean result = isRandomEquals(mas1, mas2);
        assertFalse(result);
    }
}