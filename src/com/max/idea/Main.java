package com.max.idea;

public class Main {
    public static void main(String[] args) {
        int[] fiveDigitArray = new int[] {10, 20, 30, 40, 50};
        fiveDigitArray[0] = 50;
        fiveDigitArray[(fiveDigitArray.length - 1)] = 10;
        System.out.println(fiveDigitArray[0] + fiveDigitArray[(fiveDigitArray.length - 3)]);
    }
}
