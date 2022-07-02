package com.company;

import java.util.Arrays;

public class Main {
    public static String[] convertToSnakeCase(String[] camelCase) {
        String[] snakeCase = new String[camelCase.length];
        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < camelCase[i].length(); j++) {
                char letter = camelCase[i].toCharArray()[j];
                if (Character.isLowerCase(letter)) {
                    stringBuilder.append(letter);
                } else {
                    stringBuilder.append("_");
                    stringBuilder.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = stringBuilder.toString();
        }
        return snakeCase;
    }

    public static void main(String[] args) {
        String[] camelCase = { "myVar", "firstItem", "camelCase"};
        System.out.println(Arrays.toString(convertToSnakeCase(camelCase)));
    }
}
