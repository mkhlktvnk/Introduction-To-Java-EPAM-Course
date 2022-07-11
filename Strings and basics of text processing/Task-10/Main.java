package com.company;

public class Main {
    public static int countSymbolsMatch(String string, char symbol) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSymbolsMatch("aaaaaaabbbbccccddd", 'a'));
    }
}
