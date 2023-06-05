package com.max.idea;

import java.util.Scanner;

public class Main {

    public static final double POUND_TO_KG = 2.2046;
    public static final double MILE_TO_METER = 1609.34;
    public static final double YD_TO_METER = 0.9144;
    public static final double FOOT_TO_METER = 0.3048;

    public static void main(String[] args) {
        double answer;
        int mode, choice;
        double value, len_in_m;
        String unit;

        Scanner reader = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        mode = reader.nextInt();

        switch (mode) {
            case 1:
                System.out.println("\nВыберите единицу измерения: 1 - килограмм, 2 - фунт");
                choice = reader.nextInt();
                System.out.println("\nВведите количество единиц:");
                value = reader.nextDouble();
                switch (choice) {
                    case 1:
                        answer = value * POUND_TO_KG;
                        unit = "фт.";
                        break;

                    case 2:
                        answer = value / POUND_TO_KG;
                        unit = "кг.";
                        break;

                    default: System.out.println("\nВведите 1 или 2");
                        return;
                }
                System.out.println("\nСконвертированная масса равна: " + answer + ' ' + unit);
                return;

            case 2:
                System.out.print("\nВыберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут ");
                choice = reader.nextInt();
                System.out.println("\nВведите количество единиц:");
                value = reader.nextDouble();
                switch (choice){
                    case 1: len_in_m = value;
                        break;
                    case 2: len_in_m = value * MILE_TO_METER;
                        break;
                    case 3: len_in_m = value * YD_TO_METER;
                        break;
                    case 4: len_in_m = value * FOOT_TO_METER;
                        break;

                    default: System.out.println("\nВведите число от 1 до 4");
                        return;
                }
                System.out.println("\nРезультат:");
                System.out.println("\nМетры: " + len_in_m);
                System.out.println("\nМили: " + len_in_m / MILE_TO_METER);
                System.out.println("\nЯрды: " + len_in_m / YD_TO_METER);
                System.out.println("\nФуты: " + len_in_m / FOOT_TO_METER);
                return;

            default: System.out.println("Введите корректный вариант!");
        }
    }
}
