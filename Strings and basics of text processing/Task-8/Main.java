package com.company;

public class Main {
    public static boolean isPalindrome(String string) {
        String reversed = new StringBuilder(string).reverse().toString();
        return string.equals(reversed);
    }
    public static void main(String[] args) {
        String text = "civic";
        System.out.println(isPalindrome(text));
    }
}
