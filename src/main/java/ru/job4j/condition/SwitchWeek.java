package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name = switch (day) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Срядя";
            case 4 -> "Чуэтвергэ";
            case 5 -> "Пятухница";
            case 6 -> "Суббота";
            case 7 -> "Воскресение";
            default -> "Ошибка";
        };
        return name;
    }
}
