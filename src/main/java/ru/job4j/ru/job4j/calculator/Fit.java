package ru.job4j.ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (187 - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl1 = (187 - 110) * 1.15;
        return rsl1;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        height = 187;
        double woman = Fit.womanWeight(height);
        System.out.println("woman 187 is " + woman);
    }

}
