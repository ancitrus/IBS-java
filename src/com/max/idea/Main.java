package com.max.idea;

import java.util.HashSet;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int lines, max_chars = 0;
        String input_string, max_string = "";

        Scanner reader = new Scanner(System.in);

        System.out.println("\nВведите количетство строк");
        lines = reader.nextInt();


        for (int i=0; i < lines; i++) {
            HashSet<Character> chars = new HashSet<>();

            System.out.println("\nЗаполните строку: ");
            input_string = reader.next();

            for (int j=0; j < input_string.length(); j++){
                chars.add(input_string.charAt(j));
            }

            if (chars.size() > max_chars) {
                max_chars = chars.size();
                max_string = input_string;
            }
        }

        System.out.println("Ответ: " + max_string);
    }
}
