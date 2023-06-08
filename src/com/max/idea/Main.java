package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, max_abs;
        int min = 20, max = -20;
        int[] my_array = new int[15];

        for (i=0; i< my_array.length; i++){
            my_array[i] = 20 - (int) (40 * Math.random());
            if (my_array[i] > max) max = my_array[i];
            if (my_array[i] < min) min = my_array[i];
        }

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        if (Math.abs(min) > max)  max_abs = Math.abs(min);
        else max_abs = max;
        System.out.println("Наибольшее значение по модулю: " + max_abs);

    }
}