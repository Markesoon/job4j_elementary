package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
public class PointTest {
    @Test
    public void when1020to2010then14Dot14() {
        double expected = 14.14;
        Point a = new Point(10, 20);
        Point b = new Point(20, 10);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2020to2010then10() {
        double expected = 10;
        Point a = new Point(20, 20);
        Point b = new Point(20, 10);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3020to2010then14Dot14() {
        double expected = 14.14;
        Point a = new Point(30, 20);
        Point b = new Point(20, 10);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}