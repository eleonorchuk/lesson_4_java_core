package ru.geekbrains.lessons.jc;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] words = new String[]{
                "Beige", "Blue", "Brown", "Brown", "Gold", "Gray", "Green", "Green", "Orange", "Pink", "Pink", "Purple",
                "Red", "Silver", "White", "Yellow"
        };

        Map<String, Integer> wordsMap = new HashMap();

        System.out.println("Введенные слова:");
        for(String word:words) {
            System.out.print(word + ", ");
            if (wordsMap.containsKey(word)) {
                Integer val = wordsMap.get(word) + 1;
                wordsMap.replace(word, val);
            }
            else {
                wordsMap.put(word, 1);
            }
        }
        System.out.println("");

        System.out.println("Уникальные слова:");
        for(String word: wordsMap.keySet())
        {
            System.out.println(word + " " + wordsMap.get(word));
        }

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "2128506");
        phoneBook.add("Ivanov", "2128507");
        phoneBook.add("gos uslugi", "01");
        phoneBook.add("gos uslugi", "02");
        phoneBook.add("gos uslugi", "03");
        phoneBook.add("gos uslugi", "04");
        phoneBook.add("gos uslugi", "911");
        phoneBook.add("gos uslugi", "112");
        phoneBook.add("Petrov", "123");
        System.out.println("Ivanov" + " " + phoneBook.get("Ivanov").toString());
        System.out.println("Petrov" + " " + phoneBook.get("Petrov").toString());
        System.out.println("gos uslugi" + " " + phoneBook.get("gos uslugi").toString());

    }
    /*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных
    слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.*/
}