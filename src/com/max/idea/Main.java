package com.max.idea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число:");
        double x = Double.parseDouble(br.readLine());
        System.out.println("Введите второе число:");
        double y = Double.parseDouble(br.readLine());
        System.out.println("Введите третье число:");
        double z = Double.parseDouble(br.readLine());
        double avg = (x + y + z) / 3.0;
        System.out.println("Среднее арифметическое трех чисел: " + avg);
        double halfAvg = Math.floor(avg / 2);
        if (halfAvg > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
