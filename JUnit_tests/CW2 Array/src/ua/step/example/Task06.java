package ua.step.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Метод mixed должен возвращать новый массив, в котором значения из массива
 * mas1 чередуются значениями из массива mas2. Если длины массивов не равны, то
 * оставшиеся элементы дописываются в конец массива.
 */
public class Task06
{
    public int[] mixed(int[] mas1, int[] mas2)
    {
        if(mas1 == null) return mas2;
        if(mas2 == null) return mas1;

        ArrayList<Integer> list = new ArrayList<>(mas1.length + mas2.length);

        if(mas1.length >= mas2.length) {
            for (int i = 0; i < mas2.length; i++) {
                list.add(mas1[i]);
                list.add(mas2[i]);
            }
            for (int i = mas2.length; i < mas1.length; i++) {
                list.add(mas1[i]);
            }
        } else {
            for (int i = 0; i < mas1.length; i++) {
                list.add(mas1[i]);
                list.add(mas2[i]);
            }
            for (int i = mas1.length; i < mas2.length; i++) {
                list.add(mas2[i]);
            }
        }
        System.out.println(list);
        return list.stream().mapToInt(i -> i).toArray();
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ 
     */

    @Test
    public void testLenghts()
    {
        int[] mas1 = { 1, 2, 3 };
        int[] mas2 = { 4, 5, 6 };
        int[] result = mixed(mas1, mas2);
        assertTrue(mas1.length + mas2.length == result.length);
    }

    @Test
    public void testАшкыеEmpty()
    {
        int[] mas1 = {};
        int[] mas2 = { 1, 2, 3 };
        int[] result = mixed(mas1, mas2);
        assertArrayEquals(new int[] { 1, 2, 3 }, result);
    }

    @Test
    public void testSecondEmpty()
    {
        int[] mas1 = { 1, 2, 3 };
        int[] mas2 = {};
        int[] result = mixed(mas1, mas2);
        assertArrayEquals(new int[] { 1, 2, 3 }, result);
    }

    @Test
    public void test03()
    {
        int[] mas1 = { 1, 2, 3 };
        int[] mas2 = { 4, 5 };
        int[] result = mixed(mas1, mas2);
        assertArrayEquals(new int[] { 1, 4, 2, 5, 3 }, result);
    }

    @Test
    public void test04()
    {
        int[] mas1 = { 1, 2, 3 };
        int[] mas2 = { 4, 5, 6 };
        int[] result = mixed(mas1, mas2);
        assertArrayEquals(new int[] { 1, 4, 2, 5, 3, 6 }, result);
    }

    @Test
    public void test05()
    {
        int[] mas1 = { 1, 2 };
        int[] mas2 = { 4, 5, 6, 7 };
        int[] result = mixed(mas1, mas2);
        assertArrayEquals(new int[] { 1, 4, 2, 5, 6, 7 }, result);
    }

    @Test
    public void testSecondNull()
    {
        int[] mas1 = { 1, 2, 3 };
        int[] mas2 = null;
        int[] result = mixed(mas1, mas2);
        assertArrayEquals(new int[] { 1, 2, 3 }, result);
    }

    @Test
    public void testFirstNull()
    {
        int[] mas1 = null;
        int[] mas2 = { 1, 2, 3 };
        int[] result = mixed(mas1, mas2);
        assertArrayEquals(new int[] { 1, 2, 3 }, result);
    }

    @Test
    public void testBothNull()
    {
        int[] mas1 = null;
        int[] mas2 = null;
        int[] result = mixed(mas1, mas2);
        assertNull(result);
    }
}