package ru.geekbrains.java2.lesson2;

public class MyArrayDataException extends NumberFormatException {
    public final int row;
    public final int column;

    MyArrayDataException(int row, int column) {
        super(String.format("Значение ячейки массива [%d][%d] невозможно преобразовать в целое число", row, column));
        this.row = row;
        this.column = column;
    }
}
