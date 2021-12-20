package ru.geekbrains.java2.lesson1.task1;

public enum Sex {
    MALE("Мужчина"), FEMALE("Женщина");
    private String inRussian;

    Sex(String word) {
        inRussian = word;
    }

    public String getInRussian() {
        return inRussian;
    }
}
