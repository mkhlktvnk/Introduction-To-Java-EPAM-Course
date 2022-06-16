package com.company;

public class Main {
    public static long findSum(int n) {
        return (n * (n + 1) * (2L * n + 1)) / 6;
    }
    public static void main(String[] args) {
        System.out.println(findSum(100));
    }
}
