package ua.step.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * С учетом строки name, например: "Bob", метод helloName должен возврашать
 * приветствие формы "Hello Bob". Если строка пустая или null метод должен
 * вернуть "Hello Anonymous".
 * 
 * Подсказка: Используй конкатинацию строк. Проверка на null должна быть до
 * вызова методов у переменной name.
 */
public class Task00
{
    static public String helloName(String name)
    {
        // отладочный вывод значения входного параметра
        System.out.println(name);
        return "";
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void test00()
    {
        String result = helloName("Bob");
        assertEquals("Не верно", "Hello Bob", result);
    }

    @Test
    public void test01()
    {
        String result = helloName("World");
        assertEquals("Не верно", "Hello World", result);
    }

    @Test
    public void test02()
    {
        String result = helloName("X");
        assertEquals("Не верно", "Hello X", result);
    }

    @Test
    public void test03()
    {
        String result = helloName("");
        assertEquals("Не верно", "Hello Anonymous", result);
    }

    @Test
    public void test04()
    {
        String result = helloName("Hello");
        assertEquals("Не верно", "Hello Hello", result);
    }

    @Test
    public void test05()
    {
        String result = helloName(" 123 ");
        assertEquals("Не верно", "Hello  123 ", result);
    }

    @Test
    public void testNull()
    {
        String result = helloName(null);
        assertEquals("Не верно", "Hello Anonymous", result);
    }
}