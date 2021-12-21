package ru.geekbrains.java2.lesson1.task4;

import ru.geekbrains.java2.lesson1.task1.*;
import ru.geekbrains.java2.lesson1.task2.Unit;
import ru.geekbrains.java2.lesson1.task2.Wall;

public class UntilFirstFailureWall extends Wall {
    public UntilFirstFailureWall(float height, Unit unit) {
        super(height, unit);
    }

    @Override
    public boolean canDo(Able participant) {
        if (participant.getStatus() == Status.Passive) return false;
        if (super.canDo(participant)) return true;
        participant.setStatus(Status.Passive);
        return false;
    }
}
