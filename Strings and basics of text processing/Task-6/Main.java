package com.company;

public class Main {
    public static int findMaxCharSequenceCount(String string, char character) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                ++count;
            } else {
                if (max < count) {
                    max = count;
                }
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String text = "qweqwe     qweqwe  qwewasd           wqrqrszs";
        System.out.println(findMaxCharSequenceCount(text, ' '));
    }
}
