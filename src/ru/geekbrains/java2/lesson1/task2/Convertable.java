package ru.geekbrains.java2.lesson1.task2;

public interface Convertable {
    default float convertToCentimeter(float value, Unit unit) {
        return switch (unit) {
            case CENTIMETER -> value;
            case METER -> value * 100;
            case KILOMETER -> value * 100000;
        };
    }

    default float convertToMeter(float value, Unit unit) {
        return switch (unit) {
            case CENTIMETER -> value / 100;
            case METER -> value;
            case KILOMETER -> value * 1000;
        };
    }

    default float convertToKilometer(float value, Unit unit) {
        return switch (unit) {
            case CENTIMETER -> value / 100000;
            case METER -> value / 1000;
            case KILOMETER -> value;
        };
    }

    default float convert(Unit limitUnit, float value, Unit unit) {
        return switch (limitUnit) {
            case CENTIMETER -> convertToCentimeter(value, unit);
            case METER -> convertToMeter(value, unit);
            case KILOMETER -> convertToKilometer(value, unit);
        };
    }
}
