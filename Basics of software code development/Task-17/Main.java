package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("[Character][ASCII][HEX][BINARY]");
        for (int i = 0; i <= 255; i++) {
            System.out.printf("%c %d %X %8s\n", i, i, i, Integer.toBinaryString(i));
        }
    }
}
