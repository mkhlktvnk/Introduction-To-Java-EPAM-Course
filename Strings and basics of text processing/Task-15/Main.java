package com.company;

import java.util.Arrays;

public class Main {
    public static long getSentencesCount(String text) {
        return Arrays.stream(text.split("[.?!]")).count();
    }

    public static void main(String[] args) {
        System.out.println(getSentencesCount("Hi, how are you? I'm fine, thank you. Ok!"));
    }
}
