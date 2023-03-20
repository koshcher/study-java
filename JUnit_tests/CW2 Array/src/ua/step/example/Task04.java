package ua.step.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import org.junit.Test;

/**
 * Метод getMins должен вернуть новый массив который будет содержать элементы из
 * массива mas, значения которых строго меньше значения min. Значения в
 * результирующем массиве должны быть отсортиированны по убыванию.
 * 
 * Подсказка: Используй метод Arrays.sort для сортировки массива (в натуральном
 * порядке) и если решил задачу из Task00 используй метод reverseArray для расположения
 * элементов в обратном порядке.
 */
public class Task04
{
    public int[] getMins(int[] mas, int min)
    {
        if(mas == null) return  null;
        ArrayList<Integer> list = new ArrayList<>();
        for (int el: mas) {
            if(el < min) list.add(el);
        }
        Collections.sort(list);
        Collections.reverse(list);
        return list.stream().mapToInt(i -> i).toArray();
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void test00()
    {
        int[] mas = null;
        int[] result = getMins(mas, 0);
        assertNull(result);
    }

    @Test
    public void test01()
    {
        int[] mas = { 1, -2, 3, -1 };
        int[] result = getMins(mas, 0);
        assertArrayEquals(new int[] { 1, -2, 3, -1 }, mas);
        assertArrayEquals(new int[] { -1, -2 }, result);
    }

    @Test
    public void test02()
    {
        int[] mas = { 11, 10, 9 };
        int[] result = getMins(mas, 10);
        assertArrayEquals("Исходный массив не должен быть изменен", new int[] { 11, 10, 9 }, mas);
        assertArrayEquals(new int[] { 9 }, result);
    }

    @Test
    public void test03()
    {
        int[] mas = { 10, 20, 30, 40 };
        int[] result = getMins(mas, 31);
        assertArrayEquals(new int[] { 30, 20, 10 }, result);
    }

    @Test
    public void test04()
    {
        int[] mas = {};
        int[] result = getMins(mas, 0);
        assertArrayEquals(new int[] {}, result);
    }

    @Test
    public void test05()
    {
        int[] mas = { -1, 0, 1 };
        int[] result = getMins(mas, 0);
        assertArrayEquals(new int[] { -1 }, result);
    }

    @Test
    public void test06()
    {
        int[] mas = { -1, -0, -2 };
        int[] result = getMins(mas, -1);
        assertArrayEquals(new int[] { -2 }, result);
    }
}