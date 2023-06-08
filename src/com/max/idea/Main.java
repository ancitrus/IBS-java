package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double roubles, currency, dollars;

        Scanner reader = new Scanner(System.in);

        System.out.println("Введите колиество рублей");
        roubles = reader.nextDouble();

        System.out.println("Введите курс доллара");
        currency = reader.nextDouble();

        dollars = roubles / currency;
        System.out.println("Количество долларов: " + String.format("%.2f", dollars));
    }
}
