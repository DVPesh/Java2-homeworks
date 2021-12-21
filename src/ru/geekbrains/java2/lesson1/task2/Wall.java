package ru.geekbrains.java2.lesson1.task2;

import ru.geekbrains.java2.lesson1.task1.Able;

public class Wall implements Convertable, Executable {
    private final float height;
    private final Unit unit;

    public Wall(float height, Unit unit) {
        this.height = height;
        this.unit = unit;
    }

    public float getHeight() {
        return height;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public boolean canDo(Able participant) {
        System.out.print("Препятствие: " + this + " -> ");
        return participant.jump(height, unit);
    }

    @Override
    public String toString() {
        return String.format("стена %s%s",
                Convertable.super.convertToMeter(height, unit), Unit.METER.getInRussian());
    }
}
