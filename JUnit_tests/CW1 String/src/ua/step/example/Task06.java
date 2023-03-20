package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * При заданной строке str нечетной длины метод getMiddleThree должен возвращать
 * три символа из ее середины, Например при входе «Candy» должно вернуть «and».
 * Если длина строки str менее 3 символов или количество символов четное, метод
 * должен вернуть null.
 *
 */
public class Task06
{
    static public String getMiddleThree(String str)
    {
        return "";
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void testResultCount()
    {
        String result = getMiddleThree("Candy");
        assertEquals("Не верное количество символов", 3, result.length());
    }

    @Test
    public void testNull()
    {
        String result = getMiddleThree("abcd");
        assertNull("Не верное количество символов", result);
    }

    @Test
    public void test01()
    {
        String result = getMiddleThree("Candy");
        assertEquals("Не верно", "and", result);
    }

    @Test
    public void test02()
    {
        String result = getMiddleThree("and");
        assertEquals("Не верно", "and", result);
    }

    @Test
    public void test03()
    {
        String result = getMiddleThree("solving");
        assertEquals("Не верно", "lvi", result);
    }

    @Test
    public void test04()
    {
        String result = getMiddleThree("Hi yet Hi");
        assertEquals("Не верно", "yet", result);
    }

    @Test
    public void test05()
    {
        String result = getMiddleThree("java yet java");
        assertEquals("Не верно", "yet", result);
    }

    @Test
    public void test06()
    {
        String result = getMiddleThree("Chocolate");
        assertEquals("Не верно", "col", result);
    }

    @Test
    public void test07()
    {
        String result = getMiddleThree("XabcxyzabcX");
        assertEquals("Не верно", "xyz", result);
    }

    @Test
    public void test08()
    {
        String result = getMiddleThree("1");
        assertNull("Короткая строка не обрабатывается", result);
    }

    @Test
    public void test09()
    {
        String result = getMiddleThree("aa");
        assertNull("Короткая строка не обрабатывается", result);
    }
}