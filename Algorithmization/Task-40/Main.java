package com.company;

public class Main {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static boolean isPrime(int a, int b, int c) {
        return gcd(a, gcd(b, c)) == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(14, 17, 25));
    }
}
