package com.company;

public class Main {
    private static String changeWordToLetter(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (i + 3 < string.length() && string.charAt(i) == 'w'
                    && string.charAt(i + 1) == 'o'
                    && string.charAt(i + 2) == 'r'
                    && string.charAt(i + 3) == 'd') {
                stringBuilder.append("letter");
                i += 3;
            } else {
                stringBuilder.append(string.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(changeWordToLetter("word word abc qwe asd word"));
    }
}
