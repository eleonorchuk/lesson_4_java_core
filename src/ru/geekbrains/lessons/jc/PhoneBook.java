package ru.geekbrains.lessons.jc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    /*2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
    В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер
    телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
    тогда при запросе такой фамилии должны выводиться все телефоны.*/

    private Map<String, ArrayList<String>> book;

    public void add(String surname, String phone) {
        System.out.println("PhoneBook add " + surname + " " + phone);
        if (book.containsKey(surname)) {
            ArrayList<String> phoneList = book.get(surname);
            phoneList.add(phone);
        }
        else {
            ArrayList<String> phoneList = new ArrayList<>();
            phoneList.add(phone);
            book.put(surname, phoneList);
        }
    }

    public ArrayList<String> get(String surname){
        return book.get(surname);
    }

    public PhoneBook() {
        System.out.println("Phone Book created");
        book = new HashMap();
    }
}
