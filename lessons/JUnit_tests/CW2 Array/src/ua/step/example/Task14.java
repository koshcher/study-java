package ua.step.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Метод circularShift принимает на вход массив целых чисел и число. Метод
 * должен сдвинуть все элементы влево number раз так чтобы при сдвиге элемент
 * под индекосом 0 попадал в крайний правый элемент массива.
 * 
 */
public class Task14
{
    public void circularShift(int[] mas, int number)
    {
        if(mas == null || mas.length <= 1) return;

        number = number % mas.length;
        while (number-- > 0)
        {
            int tmp = mas[0];
            for (int i = 1; i < mas.length; i++)
                mas[i - 1] = mas[i];
            mas[mas.length - 1] = tmp;
        }

        System.out.println(mas);
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void testNull()
    {
        int[] mas = null;
        circularShift(mas, 1);
        assertNull(mas);
    }

    @Test
    public void testEmpty()
    {
        int[] mas = new int[] {};
        circularShift(mas, 1);
        assertArrayEquals(new int[] {}, mas);
    }

    @Test
    public void testOne()
    {
        int[] mas = new int[] { 1 };
        circularShift(mas, 1);
        assertArrayEquals(new int[] { 1 }, mas);
    }

    @Test
    public void testTwo()
    {
        int[] mas = new int[] { 1, 2 };
        circularShift(mas, 1);
        assertArrayEquals(new int[] { 2, 1 }, mas);
    }

    @Test
    public void test3()
    {
        int[] mas = new int[] { 1, 2, 3 };
        circularShift(mas, 1);
        assertArrayEquals(new int[] { 2, 3, 1 }, mas);
    }

    @Test
    public void test4()
    {
        int[] mas = new int[] { 4, 3, 2, 1 };
        circularShift(mas, 1);
        assertArrayEquals(new int[] { 3, 2, 1, 4 }, mas);
    }

    @Test
    public void test4Shift2()
    {
        int[] mas = new int[] { 4, 3, 2, 1 };
        circularShift(mas, 2);
        assertArrayEquals(new int[] { 2, 1, 4, 3 }, mas);
    }

    @Test
    public void test4Shift3()
    {
        int[] mas = new int[] { 4, 3, 2, 1 };
        circularShift(mas, 3);
        assertArrayEquals(new int[] { 1, 4, 3, 2 }, mas);
    }

    @Test
    public void test4Shift4()
    {
        int[] mas = new int[] { 4, 3, 2, 1 };
        circularShift(mas, 4);
        assertArrayEquals(new int[] { 4, 3, 2, 1 }, mas);
    }

    @Test
    public void test4Shift5()
    {
        int[] mas = new int[] { 4, 3, 2, 1 };
        circularShift(mas, 5);
        assertArrayEquals(new int[] { 3, 2, 1, 4 }, mas);
    }
}