package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * Имеется два неотрицательных целых числа first и second, если значение суммы
 * этих чисел имеет такое же количество цифр, как и значение параметра first
 * метод должен вернуть сумму данных чисел. Если сумма имеет больше цифр, чем
 * есть в числе first, метод должен вернуть значение параметра first. 
 * Подсказка:
 * Для вычисления количества цифр в числе используй преобразования числа в
 * строку и метод length
 */
public class Task01
{
    static public int sumLimit(int first, int second)
    {
        // отладочный вывод значений входных параметров
        System.out.printf("%d %d%n", first, second);
        return -1;
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void test01()
    {
        int result = sumLimit(2, 3);
        assertEquals("Не верно", 5, result);
    }

    @Test
    public void test02()
    {
        int result = sumLimit(8, 3);
        assertEquals("Не верно", 8, result);
    }

    @Test
    public void test03()
    {
        int result = sumLimit(8, 1);
        assertEquals("Не верно", 9, result);
    }

    @Test
    public void test04()
    {
        int result = sumLimit(11, 39);
        assertEquals("Не верно", 50, result);
    }

    @Test
    public void test05()
    {
        int result = sumLimit(11, 99);
        assertEquals("Не верно", 11, result);
    }

    @Test
    public void test06()
    {
        int result = sumLimit(0, 0);
        assertEquals("Не верно", 0, result);
    }

    @Test
    public void test07()
    {
        int result = sumLimit(99, 0);
        assertEquals("Не верно", 99, result);
    }

    @Test
    public void test08()
    {
        int result = sumLimit(99, 1);
        assertEquals("Не верно", 99, result);
    }

    @Test
    public void test09()
    {
        int result = sumLimit(1, 123);
        assertEquals("Не верно", result, 1);
    }

    @Test
    public void test10()
    {
        int result = sumLimit(23, 60);
        assertEquals("Не верно", 83, result);
    }

    @Test
    public void test11()
    {
        int result = sumLimit(9000, 1);
        assertEquals("Не верно", 9001, result);
    }

    @Test
    public void test12()
    {
        int result = sumLimit(9000, 1000);
        assertEquals("Не верно", 9000, result);
    }
}