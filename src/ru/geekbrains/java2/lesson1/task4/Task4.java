package ru.geekbrains.java2.lesson1.task4;

import ru.geekbrains.java2.lesson1.task1.Able;
import ru.geekbrains.java2.lesson1.task2.*;

public class Task4 {
    public static Executable[] obstacles = new Executable[]{
            new UntilFirstFailureTrack(10.03f, Unit.KILOMETER),
            new UntilFirstFailureWall(135.0f, Unit.CENTIMETER),
            new UntilFirstFailureWall(0.65f, Unit.METER),
            new UntilFirstFailureTrack(534f, Unit.METER)
    };

    public static void main(String[] args) {
        for (Executable obstacle : obstacles) {
            for (Able participant : Task2.participants) {
                obstacle.canDo(participant);
            }
        }
    }
}
