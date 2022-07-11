package com.company;

public class Main {
    private static boolean isEnglishLetter(int code) {
        return code >= 65 && code <= 122 && Character.isLetter(code);
    }

    public static long getUpperCaseLettersCount(String string) {
        return string.chars().filter(c -> Character.isUpperCase(c) && isEnglishLetter(c)).count();
    }

    public static long getLowerCaseLettersCount(String string) {
        return string.chars().filter(c -> Character.isLowerCase(c) && isEnglishLetter(c)).count();
    }

    public static void main(String[] args) {
        String text = "qwe QWEASD абвгд";
        System.out.println(getLowerCaseLettersCount(text));
        System.out.println(getUpperCaseLettersCount(text));
    }
}
