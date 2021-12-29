package ru.geekbrains.java2.lesson3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class TelephoneDirectory {

    private HashMap<String, String> phoneBook = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        phoneBook.put(phoneNumber, surname);
    }

    public LinkedList<String> get(String surname) {
        LinkedList<String> phoneNumberList = new LinkedList<>();
        for (Map.Entry<String, String> record : phoneBook.entrySet()) {
            if (surname.equals(record.getValue())) phoneNumberList.add(record.getKey());
        }
        return phoneNumberList;
    }

}
