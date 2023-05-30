package com.max.idea;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double num1;
        double num2;
        double answer;
        char operator;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите 2 числа: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nВведите один из символов ‘+’, ‘-’, ‘*’ или ‘/’ : ");
        operator = reader.next().charAt(0);
        switch(operator) {
            case '+': answer = num1 + num2;
                break;
            case '-': answer = num1 - num2;
                break;
            case '*': answer = num1 * num2;
                break;
            case '/': answer = num1 / num2;
                break;
            default:  System.out.print("Введите корректный оператор!");
                return;
        }
        System.out.print("\nРезультат выполнения соответствующей арифметической операции:\n");
        System.out.print(num1 + " " + operator + " " + num2 + " = " + answer);
    }
}
