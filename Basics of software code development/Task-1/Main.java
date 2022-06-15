package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int function(int a, int b, int c) {
        return ((a - 3) * b / 2) + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c = 0;
        try {
            System.out.print("a = ");
            a = scanner.nextInt();
            System.out.print("b = ");
            b = scanner.nextInt();
            System.out.print("c = ");
            c = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
            return;
        }
        int z = function(a, b, c);
        System.out.println("z = " + z);
    }
}
