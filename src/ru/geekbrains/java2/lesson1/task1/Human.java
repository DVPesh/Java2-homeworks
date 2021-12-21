package ru.geekbrains.java2.lesson1.task1;

import ru.geekbrains.java2.lesson1.task2.Convertable;
import ru.geekbrains.java2.lesson1.task2.Unit;

public class Human implements Able, Convertable {
    private final String name;
    private final String surname;
    private final Sex sex;
    private float jumpLimit = 0;
    private Unit jumpLimitUnit = Unit.METER;
    private float runLimit = 0;
    private Unit runLimitUnit = Unit.METER;
    private Status status = Status.Active;

    public Human(String name, String surname, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    public Human(String name, String surname, Sex sex, float jumpLimit,
                 Unit jumpLimitUnit, float runLimit, Unit runLimitUnit) {
        this(name, surname, sex);
        setJumpLimit(jumpLimit, jumpLimitUnit);
        setRunLimit(runLimit, runLimitUnit);
    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public void setJumpLimit(float jumpLimit, Unit jumpLimitUnit) {
        this.jumpLimit = jumpLimit;
        this.jumpLimitUnit = jumpLimitUnit;
    }

    @Override
    public void setRunLimit(float runLimit, Unit runLimitUnit) {
        this.runLimit = runLimit;
        this.runLimitUnit = runLimitUnit;
    }

    @Override
    public void jump() {
        System.out.println(this + " прыгнул" + (sex == Sex.MALE ? "" : "а"));
    }

    @Override
    public boolean jump(float value, Unit unit) {
        float jumpValue = convert(jumpLimitUnit, value, unit);
        System.out.print(this +
                String.format(" {ограничение прыжка: %g%s} ", jumpLimit, jumpLimitUnit.getInRussian()));
        if (jumpLimit >= jumpValue) {
            System.out.println("успешно перепрыгнул" + (sex == Sex.MALE ? "" : "а"));
            return true;
        }
        System.out.println("не смог" + (sex == Sex.MALE ? "" : "ла") + " перепрыгнуть");
        return false;
    }

    @Override
    public void run() {
        System.out.println(this + " пробежал" + (sex == Sex.MALE ? "" : "а"));
    }

    @Override
    public boolean run(float value, Unit unit) {
        float runValue = convert(runLimitUnit, value, unit);
        System.out.print(this +
                String.format(" {ограничение бега: %g%s} ", runLimit, runLimitUnit.getInRussian()));
        if (runLimit >= runValue) {
            System.out.println("успешно пробежал" + (sex == Sex.MALE ? "" : "а"));
            return true;
        }
        System.out.println("не смог" + (sex == Sex.MALE ? "" : "ла") + " пробежать");
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", sex.getInRussian(), name, surname);
    }
}
