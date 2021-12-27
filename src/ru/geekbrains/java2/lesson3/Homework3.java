package ru.geekbrains.java2.lesson3;

import java.util.*;

public class Homework3 {

    public static void main(String[] args) {
        runTask1(); //задание №1
        runTask2(); //задание №2
    }

    private static void runTask1() {
        String[] wordArray = {
                "Суперджет-100", "Ан-140", "Ту-204", "Суперджет-100", "Ан-140",
                "A220", "A310", "A320", "A330", "A310",
                "Boeing-717", "Boeing-737", "Boeing-777", "Boeing-737", "Boeing-777",
                "A310", "Суперджет-100", "A220"
        };

        TreeSet<String> wordSet = new TreeSet<>(new ArrayList<>(Arrays.asList(wordArray)));
        System.out.println("Список уникальных слов " + wordSet);

        for (String uniqueWord : wordSet) {
            int counter = 0;
            for (String word : wordArray) {
                if (uniqueWord.equals(word)) counter++;
            }
            System.out.println(uniqueWord + " : " + counter);
        }
    }

    private static void runTask2() {
        System.out.println("=============================== телефонная книга ===============================");

        TelephoneDirectory myPhoneBook = createMyPhoneBook();

        getPhoneNumbers(myPhoneBook, "Сухарев");
        getPhoneNumbers(myPhoneBook, "Рубцова");
        getPhoneNumbers(myPhoneBook, "Потапов", "Фёдоров", "Кузьмина", "Зиновьев");
        getPhoneNumbers(myPhoneBook, "Соловьёв");//такой фамилии нет в телефонной книге
    }

    private static TelephoneDirectory createMyPhoneBook() {

        TelephoneDirectory phoneBook = new TelephoneDirectory();

        phoneBook.add("Сухарев", "+7(495)3451226");
        phoneBook.add("Рубцова", "+7(367)1123452");
        phoneBook.add("Сухарев", "+7(962)9934521");
        phoneBook.add("Яковлева", "8(982)2347070");
        phoneBook.add("Комолова", "+7(234)7889451");
        phoneBook.add("Сухарев", "8(499)3215690");
        phoneBook.add("Кузьмина", "+7(432)6783451");
        phoneBook.add("Зиновьев", "(495)2215687");
        phoneBook.add("Рубцова", "+7(672)4567823");
        phoneBook.add("Фёдоров", "+7(451)1113423");
        phoneBook.add("Васильев", "8(332)6743211");
        phoneBook.add("Фёдоров", "8(230)2341290");
        phoneBook.add("Петров", "+7(499)3396070");
        phoneBook.add("Фёдоров", "8(334)2002121");
        phoneBook.add("Потапов", "+7(112)2348900");
        phoneBook.add("Фёдоров", "+7(212)4567823");
        phoneBook.add("Воронов", "+7(111)3456712");
        phoneBook.add("Егоров", "8(500)9002021");
        phoneBook.add("Стрельникова", "+7(234)3456712");
        phoneBook.add("Львова", "+7(499)9804523");

        return phoneBook;
    }

    private static void getPhoneNumbers(TelephoneDirectory phoneBook, String... surnames) {
        for (String surname : surnames) {
            System.out.printf("%s %s%n", surname, phoneBook.get(surname));
        }
    }

}
