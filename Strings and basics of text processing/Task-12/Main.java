package com.company;

public class Main {
    public static String removeDuplicateSymbolsAndSpaces(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        string.chars().filter(character -> character != ' ')
                .distinct().forEach(character -> stringBuilder.append((char) character));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateSymbolsAndSpaces(" abc qwe abc qwe abc qwe qqqqq"));
    }
}
