package com.max.idea;


import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;


public class Main {
    public static void main(String[] args) {
        StringJoiner latins = new StringJoiner(", ");
        String user_input;

        Scanner reader = new Scanner(System.in);

        System.out.println("Введите строку из слов, разделенных пробелами");
        user_input = reader.nextLine();

        String[] words = user_input.split(" ");

        int cnt = 0;
        for (String word : words) {
            if (word.matches("\\b[A-Za-z]+\\b")) {
                latins.add(word);
                cnt++;
            }
        }

        if(cnt > 0)
            System.out.println("\nЛатинские слова: " + latins);
        System.out.println("\nКоличество латинских слов: " + cnt);
    }
}
