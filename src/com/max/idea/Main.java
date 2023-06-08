package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        int x_pos = -1, answer;

        Scanner reader = new Scanner(System.in);

        System.out.println("Введите 5 символов");
        input = reader.nextLine();

        if (input.length() != 5) {
            System.out.println("Вы ввели неверное количестсво символов");
            return;
        }

        char op_char = input.charAt(1);
        char eq_char = input.charAt(3);
        char a = input.charAt(0), b = input.charAt(2), c = input.charAt(4);

        if (!((op_char == '+') || (op_char == '-'))) {
            System.out.println("Неверный знак операции");
            return;
        }
        if (eq_char != '=') {
            System.out.println("Знак равенства не найден");
            return;
        }

        if (!Character.isDigit(a)) {
            if (a == 'x') {
                x_pos = 0;
            }
            else {
                System.out.println("Введен неверный символ");
                return;
            }
        }

        if (!Character.isDigit(b)) {
            if (b == 'x' && x_pos == -1) {
                x_pos = 2;
            }
            else {
                System.out.println("Введен неверный символ");
                return;
            }
        }

        if (!Character.isDigit(c)) {
            if (c == 'x' && x_pos == -1) {
                x_pos = 4;
            }
            else {
                System.out.println("Введен неверный символ");
                return;
            }
        }

        if (x_pos == -1) {
            System.out.println("Символ 'x' не найден");
            return;
        }
        int int_a = Character.getNumericValue(a);
        int int_b = Character.getNumericValue(b);
        int int_c = Character.getNumericValue(c);


        if (x_pos == 4) {
            if (op_char == '-') answer =  int_a -  int_b;
            else answer =  int_a +  int_b;
        }
        else if (x_pos == 0) {
            if (op_char == '-') answer =  int_c +  int_b;
            else answer =  int_c -  int_b;
        }
        else {
            if(op_char == '-') answer = -1 * ( int_c +  int_a);
            else answer =  int_c -  int_a;
        }
        System.out.println("Ответ: " + answer);
    }
}
