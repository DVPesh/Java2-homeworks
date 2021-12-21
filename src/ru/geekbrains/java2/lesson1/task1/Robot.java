package ru.geekbrains.java2.lesson1.task1;

import ru.geekbrains.java2.lesson1.task2.Convertable;
import ru.geekbrains.java2.lesson1.task2.Unit;

public class Robot implements Able, Convertable {
    private final String nickname;
    private final Model model;
    private float jumpLimit = 0;
    private Unit jumpLimitUnit = Unit.METER;
    private float runLimit = 0;
    private Unit runLimitUnit = Unit.METER;
    private Status status = Status.Active;

    public Robot(String nickname, Model model) {
        this.nickname = nickname;
        this.model = model;
    }

    public Robot(String nickname, Model model, float jumpLimit, Unit jumpLimitUnit, float runLimit, Unit runLimitUnit) {
        this(nickname, model);
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
        System.out.println(this + " прыгнул");
    }

    @Override
    public boolean jump(float value, Unit unit) {
        float jumpValue = convert(jumpLimitUnit, value, unit);
        System.out.print(this +
                String.format(" {ограничение прыжка: %g%s} ", jumpLimit, jumpLimitUnit.getInRussian()));
        if (jumpLimit >= jumpValue) {
            System.out.println("успешно перепрыгнул");
            return true;
        }
        System.out.println("не смог перепрыгнуть");
        return false;
    }

    @Override
    public void run() {
        System.out.println(this + " пробежал");
    }

    @Override
    public boolean run(float value, Unit unit) {
        float runValue = convert(runLimitUnit, value, unit);
        System.out.print(this +
                String.format(" {ограничение бега: %g%s} ", runLimit, runLimitUnit.getInRussian()));
        if (runLimit >= runValue) {
            System.out.println("успешно пробежал");
            return true;
        }
        System.out.println("не смог пробежать");
        return false;
    }

    @Override
    public String toString() {
        return "Робот{" +
                "имя='" + nickname + '\'' +
                ", модель=" + model +
                '}';
    }
}
