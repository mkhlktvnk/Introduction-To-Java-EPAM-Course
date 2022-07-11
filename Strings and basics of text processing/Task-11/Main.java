package com.company;

public class Main {
    public static String doubleCharacters(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        string.chars().forEach((character) -> {
            stringBuilder.append((char)character);
            stringBuilder.append((char)character);
        });
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        System.out.println(doubleCharacters("abcabc"));
    }
}
