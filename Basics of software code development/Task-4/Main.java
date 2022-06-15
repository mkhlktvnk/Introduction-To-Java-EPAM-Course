package com.company;

public class Main {
    public static void main(String[] args) {
        double value = 325.214;
        double reversed = (value * 1000) % 1000 + (int) value / 1000.0;
        System.out.println(reversed);
    }
}
