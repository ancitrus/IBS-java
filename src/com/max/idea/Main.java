package com.max.idea;

import java.util.Scanner;

public class Main {

    public static final int X = 2;
    public static final int Y = 33;
    public static final int Z = 100;

    public static void main(String[] args) {
        int array_length, i;

        Scanner reader = new Scanner(System.in);

        System.out.println("Введите размер массива");
        array_length = reader.nextInt();
        int[] user_array = new int[array_length];

        System.out.println("\nВведите данные с клавиатуры в массив");
        for (i = 0; i < array_length; i++) {
            System.out.print("\n" + (i+1) + ": ");
            user_array[i] = reader.nextInt();

            if (user_array[i] == X || user_array[i] == Y || user_array[i] == Z) {
                System.out.println("Данное значение " + user_array[i]+ " имеется в константах");
            }
        }
    }
}
