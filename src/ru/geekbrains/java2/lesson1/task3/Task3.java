package ru.geekbrains.java2.lesson1.task3;

import ru.geekbrains.java2.lesson1.task1.Able;
import ru.geekbrains.java2.lesson1.task2.*;

public class Task3 {
    public static Executable[] obstacles = new Executable[]{
            new Track(10.03f, Unit.KILOMETER),
            new Wall(135.0f, Unit.CENTIMETER),
            new Wall(0.65f, Unit.METER),
            new Track(534f, Unit.METER)
    };

    public static void main(String[] args) {
        for (Executable obstacle : obstacles) {
            for (Able participant : Task2.participants) {
                obstacle.canDo(participant);
            }
        }
    }
}
