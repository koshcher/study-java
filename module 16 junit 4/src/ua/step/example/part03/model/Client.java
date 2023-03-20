package ua.step.example.part03.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client
{
    private int id;
    private List<TimeInterval> intervals = new ArrayList<>();

    public int getId()
    {
        return id;
    }
    public boolean addInterval(TimeInterval interval) {
        return intervals.add(interval);
    }
    public List<TimeInterval> getIntervals()
    {
        return Collections.unmodifiableList(intervals);
    }
}