package com.max.idea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int array_length;
        double sum = 0;

        Scanner reader = new Scanner(System.in);

        System.out.println("Введите размер массива");
        array_length = reader.nextInt();
        double[] user_array = new double[array_length];

        System.out.println("\nВведите данные с клавиатуры в массив");
        for (int i = 0; i < array_length; i++) {
            System.out.print("\n" + (i+1) + ": ");
            user_array[i] = reader.nextDouble();
        }

        for (int i=0; i < array_length; i++){
            sum = sum + user_array[i];
        }
        System.out.println("Среднее значение равно " + (sum/array_length));
    }
}
