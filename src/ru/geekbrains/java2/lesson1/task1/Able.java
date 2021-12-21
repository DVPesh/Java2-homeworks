package ru.geekbrains.java2.lesson1.task1;

import ru.geekbrains.java2.lesson1.task2.Unit;

public interface Able {
    void jump();

    boolean jump(float value, Unit unit);

    void run();

    boolean run(float value, Unit unit);

    Status getStatus();

    void setStatus(Status status);

    void setJumpLimit(float jumpLimit, Unit jumpLimitUnit);

    void setRunLimit(float runLimit, Unit runLimitUnit);
}
