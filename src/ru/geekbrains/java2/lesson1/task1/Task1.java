package ru.geekbrains.java2.lesson1.task1;

import java.util.Random;

public class Task1 {
    public static Able[] participants = new Able[]{
            new Human("Николай", "Васильев", Sex.MALE),
            new Cat("Мурзик", Color.GRAY),
            new Robot("Бот385", Model.FALCOM69),
            new Human("Тамара", "Комолова", Sex.FEMALE),
            new Cat("Рекардо", Color.BROWN),
            new Robot("Бот18", Model.SJD34)
    };

    public static void main(String[] args) {
        Random rnd = new Random();
        for (Able participant : participants) {
            if (rnd.nextBoolean()) participant.jump();
            else participant.run();
        }
    }
}
