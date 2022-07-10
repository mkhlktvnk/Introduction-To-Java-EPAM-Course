package com.company;

public class Main {
    public static int countNumbers(String string) {
        char[] chars = string.toCharArray();
        int count = 0;
        int i = 0;
        for (i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                count++;
                int j = i;
                while (Character.isDigit(chars[j++]) && j < chars.length);
                i = j;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String string = "123123qweasd234qweqw123";
        System.out.println(countNumbers(string));
    }
}
