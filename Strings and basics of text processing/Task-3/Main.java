package com.company;

public class Main {
    public static int countDigitCharacters(String string) {
        char[] chars = string.toCharArray();
        int count = 0;
        for (char character : chars) {
            if (Character.isDigit(character)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String string = "123123qweasd234";
        System.out.println(countDigitCharacters(string));
    }
}
