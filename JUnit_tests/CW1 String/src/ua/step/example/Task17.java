package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Метод getMaxLenghtWorld должен возвращать самое длинное слово в строке.
 * Словом считается набор символов отделеных от другого набора пробелами. Если в
 * строке встречаются слова одинаковой длины, вернуть в строке количество
 * повторений. Например: при входной строке "aa aa" метод должен вернуть "2 aa"
 * 
 */
public class Task17
{
    public String getMaxLenghtWorld(String str)
    {
        return null;
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void test1()
    {
        String result = getMaxLenghtWorld("a aa");
        assertEquals("Неверная строка", "aa", result);
    }

    @Test
    public void test2()
    {
        String result = getMaxLenghtWorld("aa a");
        assertEquals("Неверная строка", "aa", result);
    }

    @Test
    public void test3()
    {
        String result = getMaxLenghtWorld("bbb cc d");
        assertEquals("Неверная строка", "bbb", result);
    }

    @Test
    public void test4()
    {
        String result = getMaxLenghtWorld("1 22 333 4444 333 22 11");
        assertEquals("Неверная строка", "4444", result);
    }

    @Test
    public void test5()
    {
        String result = getMaxLenghtWorld("qq q qq q qq");
        assertEquals("Неверная строка", "3 qq", result);
    }

    @Test
    public void test6()
    {
        String result = getMaxLenghtWorld("4444 333 333 333 333 4444");
        assertEquals("Неверная строка", "2 4444", result);
    }

    @Test
    public void test7()
    {
        String result = getMaxLenghtWorld("11   11    11  1");
        assertEquals("Неверная строка", "3 11", result);
    }
}