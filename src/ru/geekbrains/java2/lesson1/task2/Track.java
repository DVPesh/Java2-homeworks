package ru.geekbrains.java2.lesson1.task2;

import ru.geekbrains.java2.lesson1.task1.Able;

public class Track implements Convertable, Executable {
    private final float length;
    private final Unit unit;

    public Track(float length, Unit unit) {
        this.length = length;
        this.unit = unit;
    }

    public float getLength() {
        return length;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public boolean canDo(Able participant) {
        System.out.print("Препятствие: " + this + " -> ");
        return participant.run(length, unit);
    }

    @Override
    public String toString() {
        return String.format("беговая дорожка %s%s",
                Convertable.super.convertToMeter(length, unit), Unit.METER.getInRussian());
    }
}
