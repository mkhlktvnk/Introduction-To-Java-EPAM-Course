package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int max(int a, int b) {
        return a > b ? a : b; // Math.max(a, b);
    }

    public static int min(int a, int b) {
        return a < b ? a : b; // Math.min(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c = 0, d = 0;
        try {
            System.out.print("a = ");
            a = scanner.nextInt();
            System.out.print("b = ");
            b = scanner.nextInt();
            System.out.print("c = ");
            c = scanner.nextInt();
            System.out.print("d = ");
            d = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
            return;
        }
        System.out.println(max(min(a, b), min(c, d)));
    }
}
