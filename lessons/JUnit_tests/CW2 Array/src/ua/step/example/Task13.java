package ua.step.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Метод getTwoMirror должен возврашать новый массив, который по размерности
 * привосходит исходный в два раза, вторая часть массива должна быть зеркальна
 * первой.
 */
public class Task13
{
    int[] getTwoMirror(int[] mas)
    {
        if(mas == null) return null;

        int[] res = new int[mas.length*2];
        for (int i = 0; i < mas.length; i++) {
            res[i] =mas[i];
            res[res.length-i -1] = mas[i];
        }
        return res;
    }

    @Test
    public void test00()
    {
        int[] mas = null;
        int[] result = getTwoMirror(mas);
        assertNull(result);
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void test01()
    {
        int[] mas = new int[] {};
        int[] result = getTwoMirror(mas);
        assertArrayEquals(new int[] {}, result);
    }

    @Test
    public void test02()
    {
        int[] mas = new int[3];
        int[] result = getTwoMirror(mas);
        assertTrue(result.length == mas.length * 2);
    }

    @Test
    public void test03()
    {
        int[] mas = new int[] { 1, 2 };
        int[] result = getTwoMirror(mas);
        assertArrayEquals("Входной массив не должен изменяться", new int[] { 1, 2 }, mas);
        assertArrayEquals(new int[] { 1, 2, 2, 1 }, result);
    }

    @Test
    public void test04()
    {
        int[] mas = new int[] { 2 };
        int[] result = getTwoMirror(mas);
        assertArrayEquals("Входной массив не должен изменяться", mas, new int[] { 2 });
        assertArrayEquals(new int[] { 2, 2 }, result);
    }

    @Test
    public void test05()
    {
        int[] mas = new int[] { 2, 1 };
        int[] result = getTwoMirror(mas);
        assertArrayEquals(new int[] { 2, 1, 1, 2 }, result);
    }

    @Test
    public void test06()
    {
        int[] mas = new int[] { 1, 1, 0 };
        int[] result = getTwoMirror(mas);
        assertArrayEquals(new int[] { 1, 1, 0, 0, 1, 1 }, result);
    }

    @Test
    public void test07()
    {
        int[] mas = new int[] { 3, 2, 1 };
        int[] result = getTwoMirror(mas);
        assertArrayEquals(new int[] { 3, 2, 1, 1, 2, 3 }, result);
    }
}