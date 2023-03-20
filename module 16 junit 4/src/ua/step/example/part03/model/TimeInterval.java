package ua.step.example.part03.model;

import java.io.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TimeInterval
{
    private String start;
    private String end;

    public TimeInterval(String interval)
    {
        String[] intervals = interval.split(" ");
        this.start = intervals[0];
        this.end = intervals[1];
    }

    public TimeInterval(String start, String end)
    {
        this.start = start;
        this.end = end;
    }

    /***************************************************************************
     * @return возвращает истину, если интервал имеет правильные значения
     */
    public boolean isValid()
    {
        // FIXME измени метод, чтобы он проверял валидность времени
        return  isTimeValid(start) && isTimeValid(end);
    }

    private boolean isTimeValid(String time) {
        try {
            List<Integer> parts =  Arrays.stream(time.split(":")).map(Integer::parseInt).collect(Collectors.toList());

            if(parts.get(0) < 0 || parts.get(0) > 24) return false;
            if(parts.get(1) < 0 || parts.get(1) > 60) return false;

            return true;
        } catch (Exception ex) {
            return  false;
        }
    }

    /***************************************************************************
     * @return Возврвщает время интервала в минутах
     */
    public int getDuration()
    {
        // FIXME исправь метод согласно работе тестов
        int hour = get(start, Type.HOUR);
        int minute = get(start, Type.MINUTE);
        int startMinute = hour * 60 + minute;
        hour = get(end, Type.HOUR);
        minute = get(end, Type.MINUTE);
        int endMinute = hour * 60 + minute;
        if (startMinute == endMinute) return 1440;

        return startMinute > endMinute ? startMinute-endMinute : endMinute - startMinute;
    }

    private static int get(String time, Type type)
    {
        return Integer.valueOf(time.split(":")[type.getIndex()]);
    }

    private enum Type
    {
        HOUR(0),
        MINUTE(1);
        
        Type(int index)
        {
            this.index = index;
        }

        private int index;

        public int getIndex()
        {
            return index;
        }
    }
}