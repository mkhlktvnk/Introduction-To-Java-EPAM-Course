package com.company;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= 200; i++) {
            result = result.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(result);
    }
}
