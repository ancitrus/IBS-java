package com.max.idea;

import java.util.Scanner;
import java.lang.Integer;


public class Main {

    public static void main(String[] args) {
        int int_var;
        String str_var;

        Scanner reader = new Scanner(System.in);

        System.out.println("Введите первое число");
        str_var = Integer.toString(reader.nextInt());

        System.out.println("Введите второе число");
        int_var = reader.nextInt();

        int cmp = Integer.valueOf(str_var).compareTo(int_var);
        if (cmp > 0){
            System.out.println("Большее число равно: " + str_var);
            System.out.println("Меньшее число равно: " + (double) int_var);
        } else if (cmp < 0){
            System.out.println("Большее число равно: " + int_var);
            System.out.println("Меньшее число равно: " + Double.valueOf(str_var));
        } else {
            System.out.println("Числа равны");
        }
    }
}
