package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, j, array_length, array_width;

        Scanner reader = new Scanner(System.in);

        System.out.println("Введите размер двумерного массива");
        array_length = reader.nextInt();
        array_width = reader.nextInt();
        int[][] user_array = new int[array_length][array_width];

        System.out.println("Заполните массив значениями");
        for (i = 0; i < array_length; i++) {
            for (j = 0; j < array_width; j++) {
                user_array[i][j] = reader.nextInt();
            }
        }

        for (j=0; j<user_array[0].length; j++){
            System.out.println(user_array[0][j] * 3);
        }
    }
}
