package com.company;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static String findTheLongestWord(String string) {
        List<String> words = List.of(string.split(" "));
        return words.stream().max(Comparator.comparing(String::length)).get();
    }
    
    public static void main(String[] args) {
        System.out.println(findTheLongestWord(findTheLongestWord("abcde efghjklmnop qwead")));
    }
}
