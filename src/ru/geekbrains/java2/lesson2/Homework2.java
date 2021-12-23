package ru.geekbrains.java2.lesson2;

public class Homework2 {
    int sum(String[][] array) {
        if (array == null || array.length != 4) {
            throw new MyArraySizeException();
        }
        for (String[] element : array) {
            if (element == null || element.length != 4) throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Homework2 testObjectVariable = new Homework2();
        String[][][] testDataSets = new String[7][][];
        testDataSets[0] = null;
        testDataSets[1] = new String[5][];
        testDataSets[2] = new String[4][];
        testDataSets[3] = new String[4][2];
        testDataSets[4] = new String[][]{
                {"1", "1E", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        testDataSets[5] = new String[][]{
                {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "string", "4"}, {"1", "2", "3", "4"}};
        testDataSets[6] = new String[][]{
                {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        for (int i = 0; i < testDataSets.length; i++) {
            try {
                System.out.printf("Сумма элементов массива равна %d%n", testObjectVariable.sum(testDataSets[i]));
            } catch (MyArraySizeException e) {
                System.out.println(e.getMessage());
            } catch (MyArrayDataException e) {
                System.out.println(e.getMessage());
                testDataSets[i][e.row][e.column] = "0";
            }
        }
        System.out.println("------------------------ после исправления ------------------------------");
        //проверка, что для всех исключений MyArrayDataException подставлены корректные значения
        for (int i = 4; i < testDataSets.length; i++) {
            try {
                System.out.printf("Сумма элементов массива равна %d%n", testObjectVariable.sum(testDataSets[i]));
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
