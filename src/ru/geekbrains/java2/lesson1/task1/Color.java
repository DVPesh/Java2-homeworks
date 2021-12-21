package ru.geekbrains.java2.lesson1.task1;

public enum Color {
    WHITE("Белый"), BLACK("Чёрный"), BROWN("Коричневый"), GRAY("Серый");
    private String inRussian;

    Color(String word) {
        inRussian = word;
    }

    public String getInRussian() {
        return inRussian;
    }
}
