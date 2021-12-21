package ru.geekbrains.java2.lesson1.task2;

public enum Unit {
    CENTIMETER("см"), METER("м"), KILOMETER("км");
    private String inRussian;

    Unit(String word) {
        inRussian = word;
    }

    public String getInRussian() {
        return inRussian;
    }
}
