package com.company;

public class Main {
    public static String insertAfter(String string, char target, char toInsert) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == target) {
                stringBuilder.append(target);
                stringBuilder.append(toInsert);
            } else {
                stringBuilder.append(string.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String text = "acacacacacacacacacacacacacac";
        System.out.println(insertAfter(text, 'a', 'b'));
    }
}
