package ru.geekbrains.java2.lesson1.task4;

import ru.geekbrains.java2.lesson1.task1.*;
import ru.geekbrains.java2.lesson1.task2.Track;
import ru.geekbrains.java2.lesson1.task2.Unit;

public class UntilFirstFailureTrack extends Track {
    public UntilFirstFailureTrack(float length, Unit unit) {
        super(length, unit);
    }

    @Override
    public boolean canDo(Able participant) {
        if (participant.getStatus() == Status.Passive) return false;
        if (super.canDo(participant)) return true;
        participant.setStatus(Status.Passive);
        return false;
    }
}
