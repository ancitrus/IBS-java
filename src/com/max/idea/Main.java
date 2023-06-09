package com.max.idea;

import java.util.Scanner;

public class Main {

    public static final int MAX_RETRIES = 3;
    public static final String ANSWER = "Заархивированный вирус";

    public static void main(String[] args) {
        String user_input;

        System.out.println("Отгадайте загадку: " +
                "“Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”");

        Scanner reader = new Scanner(System.in);

        for (int i = 1; i <= MAX_RETRIES; i++) {
            System.out.println("\nВаш ответ");
            user_input = reader.nextLine();
            if (user_input.equals(ANSWER)) {
                System.out.println("Правильно!");
                return;
            } else {
                if (user_input.equals("Подсказка")){
                    if (i!=1){
                        System.out.println("Подсказка уже недоступна");
                        i--;
                    } else {
                        System.out.println("Какая-то подсказка");
                        i=MAX_RETRIES-1;
                    }
                } else {
                    if(i<MAX_RETRIES) {
                        System.out.println("Подумай еще! И введи другой ответ");
                    }
                }
            }
        }

        System.out.println("Обидно, приходи в другой раз");
    }
}
