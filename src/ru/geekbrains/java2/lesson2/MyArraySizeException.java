package ru.geekbrains.java2.lesson2;

public class MyArraySizeException extends RuntimeException {
    MyArraySizeException() {
        super("Неверный размер массива, допустимый размер только [4][4]");
    }
}
