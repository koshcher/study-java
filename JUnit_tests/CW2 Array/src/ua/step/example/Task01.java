package ua.step.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;

import org.junit.Test;

/**
 * 
 * Метод middleWay должен возвращать новый массив из двух эллементов, где
 * значение под индексом 0 это значение среднего (центрального) элемента из
 * массива mas1, а под индексом 1 средний элемент массива mas2. Если длина
 * массива mas1 или mas2 четная метод должен венрнуть null. Если один из входных
 * параметров null, метод должен вернуть null;
 *
 */
public class Task01
{
    public int[] middleWay(int[] mas1, int[] mas2)
    {
        if(mas1 == null || mas2 == null || mas1.length % 2 == 0 || mas2.length % 2 == 0) return null;

        int middle1 = mas1[mas1.length / 2];
        int middle2 = mas2[mas2.length / 2];

        // отладочный вывод входных массивов
        System.out.println(middle1 + " : " + middle2);
        return new int[] { middle1, middle2 };
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void test00()
    {
        int[] result = middleWay(new int[] { 1, 2, 3 }, new int[] { 4, 5 });
        assertNull(result);
    }

    @Test
    public void test01()
    {
        int[] result = middleWay(new int[] { 1, 2 }, new int[] { 4, 5, 6 });
        assertNull(result);
    }

    @Test
    public void test02()
    {
        int[] result = middleWay(null, new int[] { 4, 5, 6 });
        assertNull(result);
    }

    @Test
    public void test03()
    {
        int[] result = middleWay(new int[] { 4, 5, 6 }, null);
        assertNull(result);
    }

    @Test
    public void test04()
    {
        int[] result = middleWay(null, null);
        assertNull(result);
    }

    @Test
    public void test05()
    {
        int[] result = middleWay(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 });
        assertArrayEquals(new int[] { 2, 5 }, result);
    }

    @Test
    public void test06()
    {
        int[] result = middleWay(new int[] { 7, 7, 7 }, new int[] { 3, 8, 0 });
        assertArrayEquals(new int[] { 7, 8 }, result);
    }

    @Test
    public void test07()
    {
        int[] result = middleWay(new int[] { 1, 1, 2, 2, 2 }, new int[] { 1, 1, 1 });
        assertArrayEquals(new int[] { 2, 1 }, result);
    }

    @Test
    public void test08()
    {
        int[] result = middleWay(new int[] { 1 }, new int[] { 1 });
        assertArrayEquals(new int[] { 1, 1 }, result);
    }

}