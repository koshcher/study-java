package ua.step.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * 
 * Метод reverseArray должен вернуть новый массив, в котором элементы будут
 * находится в обратном порядке относительно массива nums. Если ссылка на
 * входной массив является null метод должен вернуть null.
 * 
 * Подсказка: проверка входного параметра на значение null должна быть
 * произведена до любых действий с этм параметром.
 */
public class Task00
{
    public static int[] reverseArray(int[] mas)
    {
        if(mas == null) return null;

        int[] newMas = mas.clone();

        for(int i = 0; i < newMas.length / 2; i++)
        {
            int temp = newMas[i];
            newMas[i] = newMas[newMas.length - i - 1];
            newMas[newMas.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(newMas));
        return newMas;
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void test00()
    {
        int[] result = reverseArray(null);
        assertNull(result);
    }

    @Test
    public void test01()
    {
        int[] mas = new int[] { 1, 2, 3 };
        int[] result = reverseArray(mas);
        assertArrayEquals("Неверная комбинация", new int[] { 3, 2, 1 }, result);
        assertArrayEquals("Исходный массив не должен быть изменен", new int[] { 1, 2, 3 }, mas);
    }

    @Test
    public void test02()
    {
        int[] mas = new int[] { 5, 11, 9 };
        int[] result = reverseArray(mas);
        assertArrayEquals(new int[] { 9, 11, 5 }, result);
        assertArrayEquals("Исходный массив не должен быть изменен", new int[] { 5, 11, 9 }, mas);
    }

    @Test
    public void test03()
    {
        int[] mas = new int[] { 33, 2, 1, 0 };
        int[] result = reverseArray(mas);
        assertArrayEquals(new int[] { 0, 1, 2, 33 }, result);
        assertArrayEquals("Исходный массив не должен быть изменен", new int[] { 33, 2, 1, 0 }, mas);
    }

    @Test
    public void test04()
    {
        int[] result = reverseArray(new int[] { 1, 2, 2, 1 });
        assertArrayEquals(new int[] { 1, 2, 2, 1 }, result);
    }

    @Test
    public void test05()
    {
        int[] result = reverseArray(new int[] { 9, 8, 7, 6, 5 });
        assertArrayEquals(new int[] { 5, 6, 7, 8, 9 }, result);
    }

    @Test
    public void test06()
    {
        int[] result = reverseArray(new int[] {});
        assertArrayEquals(new int[] {}, result);
    }
}