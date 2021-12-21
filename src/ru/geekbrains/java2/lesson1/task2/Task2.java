package ru.geekbrains.java2.lesson1.task2;

import ru.geekbrains.java2.lesson1.task1.*;

public class Task2 {
    public static Able[] participants = new Able[]{
            new Human("Николай", "Васильев",
                    Sex.MALE, 161.0f, Unit.CENTIMETER, 678.0f, Unit.METER),
            new Cat("Мурзик", Color.GRAY, 234.0f, Unit.CENTIMETER, 1.65f, Unit.KILOMETER),
            new Robot("Бот385", Model.FALCOM69, 0.36f, Unit.METER, 50.45f, Unit.KILOMETER),
            new Human("Тамара", "Комолова",
                    Sex.FEMALE, 132.01f, Unit.CENTIMETER, 1678.0f, Unit.METER),
            new Cat("Рекардо", Color.BROWN, 3.04f, Unit.METER, 1650f, Unit.METER),
            new Robot("Бот18", Model.SJD34, 702f, Unit.CENTIMETER, 230.45f, Unit.KILOMETER)
    };

    public static void main(String[] args) {
        Track track1 = new Track(1.0f, Unit.KILOMETER);
        Wall wall1 = new Wall(150.0f, Unit.CENTIMETER);

        for (Able participant : participants) {
            track1.canDo(participant);
            wall1.canDo(participant);
        }
    }
}
