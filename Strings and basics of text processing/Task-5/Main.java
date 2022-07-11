package com.company;

public class Main {
    public static String removeExtraSpaces(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = text.trim().toCharArray();
        boolean isSpace = false;
        for (char character : chars) {
            if (character == ' ') {
                if (!isSpace) {
                    stringBuilder.append(' ');
                }
                isSpace = true;
            } else {
                stringBuilder.append(character);
                isSpace = false;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String text = " abcd     qweasd  sdfkdsfj    sldfksdkf    ";
        System.out.println(text);
        System.out.println(removeExtraSpaces(text));
    }
}
