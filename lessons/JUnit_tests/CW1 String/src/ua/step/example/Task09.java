package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Метод getWithoutX принимает на вход строку str, если первый или последний
 * символы в этой строке 'x', метод должен возвращать строку без начальных и
 * конечных символов 'x', иначе должен вернуть строку без изменений.
 */
public class Task09
{
    static public String getWithoutX(String str)
    {
        return "";
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ 
     */
    
    @Test
    public void test01()
    {
        String result = getWithoutX("xHix");
        assertEquals("Не верно", "Hi", result);
    }

    @Test
    public void test02()
    {
        String result = getWithoutX("xHi");
        assertEquals("Не верно", "Hi", result);
    }

    @Test
    public void test03()
    {
        String result = getWithoutX("Hxix");
        assertEquals("Не верно", "Hxi", result);
    }

    @Test
    public void test04()
    {
        String result = getWithoutX("Hi");
        assertEquals("Не верно", "Hi", result);
    }

    @Test
    public void test05()
    {
        String result = getWithoutX("xxHi");
        assertEquals("Не верно", "xHi", result);
    }

    @Test
    public void test06()
    {
        String result = getWithoutX("Hix");
        assertEquals("Не верно", "Hi", result);
    }

    @Test
    public void test07()
    {
        String result = getWithoutX("xx");
        assertTrue("Не пустая строка", result.isEmpty());
    }

    @Test
    public void test08()
    {
        String result = getWithoutX("");
        assertTrue("Не пустая строка", result.isEmpty());
    }

    @Test
    public void test09()
    {
        String result = getWithoutX("x");
        assertTrue("Не пустая строка", result.isEmpty());
    }

    @Test
    public void test10()
    {
        String result = getWithoutX("Hello");
        assertEquals("Не верно", "Hello", result);
    }

    @Test
    public void test11()
    {
        String result = getWithoutX("Hexllo");
        assertEquals("Не верно", "Hexllo", result);
    }
    
    @Test(timeout = 1)
    public void test12()
    {
        String result = getWithoutX("xYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYx");
        assertEquals("Не верно", "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY", result);
    }
}