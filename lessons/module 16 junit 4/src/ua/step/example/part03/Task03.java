package ua.step.example.part03;


import org.junit.Test;

import ua.step.example.part03.model.TimeInterval;

import static org.junit.Assert.*;

/**
 * 
 * Практическое задание 3 Набор тестовых методов тестирует класс TimeInterval
 * который содержит в себе начальное и конечное время сеанса связи
 *
 */
public class Task03
{
    @Test
    public void testTimeInterval1()
    {
        String start = "00:01";
        String end = "00:02";
        TimeInterval timeInterval = new TimeInterval(start, end);
        assertTrue(timeInterval.isValid());
        assertEquals(1, timeInterval.getDuration());
    }

    @Test
    public void testTimeInterval2()
    {
        String start = "01:01";
        String end = "01:02";
        TimeInterval timeInterval = new TimeInterval(start, end);
        assertTrue(timeInterval.isValid());
        assertEquals(1, timeInterval.getDuration());
    }

    @Test
    public void testTimeInterval3()
    {
        String start = "12:00";
        String end = "13:00";
        TimeInterval timeInterval = new TimeInterval(start, end);
        assertTrue(timeInterval.isValid());
        assertEquals(60, timeInterval.getDuration());
    }

    @Test
    public void testTimeInterval4()
    {
        String start = "12:30";
        String end = "00:30";
        TimeInterval timeInterval = new TimeInterval(start, end);
        assertTrue(timeInterval.isValid());
        assertEquals(720, timeInterval.getDuration());
    }

    @Test
    public void testTimeIntervalMax1()
    {
        String start = "00:00";
        String end = "23:59";
        TimeInterval timeInterval = new TimeInterval(start, end);
        assertTrue(timeInterval.isValid());
        assertEquals(1439, timeInterval.getDuration());
    }

    @Test
    public void testTimeIntervalMax2()
    {
        String start = "00:00";
        String end = "00:00";
        TimeInterval timeInterval = new TimeInterval(start, end);
        assertTrue(timeInterval.isValid());
        assertEquals(1440, timeInterval.getDuration());
    }

    @Test
    public void testIntervalValidation1()
    {
        String start = "00:00";
        String end = "25:00";
        TimeInterval timeInterval = new TimeInterval(start, end);
        assertFalse(timeInterval.isValid());
    }

    @Test
    public void testIntervalValidation2()
    {
        String start = "00:00";
        String end = "00:61";
        TimeInterval timeInterval = new TimeInterval(start, end);
        assertFalse(timeInterval.isValid());
    }
}
