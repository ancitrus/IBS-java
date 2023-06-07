package com.max.idea;

public class Main {
    public static void main(String[] args) {
        String STR = "I like Java!!!";

        if(STR.contains("Java") || STR.startsWith("I like") || STR.endsWith("!!!")) {
            System.out.println("Строка содержит подстроку \"Java\", начинается с  \"I like\" и " +
                    "заканчивается на \"!!!\"");
            System.out.println(STR.toUpperCase());
        } else {
            System.out.println("Строка не содержит подстроку \"Java\" или не начинается с  \"I like\" или " +
                    "не заканчивается на \"!!!\"");
        }
        String result = STR.replaceAll("a", "o");
        System.out.println(result.substring(7, 11));
    }
}
