package com.max.idea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, i, sum;
        System.out.println("Введите любое целое положительное число");
        Scanner reader = new Scanner(System.in);
        n = reader.nextInt();
        sum = 0;

       for (i=1; i<=n; i++) {
           sum = sum + i;
       }
        System.out.println(sum);
    }
}
