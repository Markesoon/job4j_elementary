package ru.job4j.Converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDolar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDolar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
    }
}
