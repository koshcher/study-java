package ua.step.example.part02;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import ua.step.example.util.StringUtils;

/**
 * Theories — чем-то схожа с Parameterized, но параметризирует тестовый метод, а не
 * конструктор. Данные помечаются с помощью @DataPoints и @DataPoint, тестовый
 * метод — с помощью @Theory
 */

@RunWith(Theories.class)
public class Task02
{
    // набор входных данных и ожижаемых результатов
    @DataPoints 
    public static Object[][] isEmptyData = new Object[][] { 
        { "", true },
        { new String(), true },
        { " ", false },
        { "some string", false }
    };
    // набор входных данных и ожижаемых результатов
    @DataPoint
    public static Object[] nullData = new Object[] { null, true };

    /**
     * тестовые методы принимают параметры
     */
    @Theory
    public void testEmpty(final Object... testData)
    {
        System.out.println(Arrays.toString(testData));
        final boolean actual = StringUtils.isEmpty((CharSequence) testData[0]);
        assertEquals(testData[1], actual);
    }
}