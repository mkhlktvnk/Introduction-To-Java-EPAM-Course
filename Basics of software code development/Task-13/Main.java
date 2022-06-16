package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int function(int x) {
        return x <= 2 ? -x : x;
    }

    public static void printFunctionValues(int a, int b, int h) {
        for (int x = a; x <= b; x += h) {
            System.out.printf("y(%d) = %d\n", x, function(x));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        int h = 0;
        try {
            System.out.print("a = ");
            a = scanner.nextInt();
            System.out.print("b = ");
            b = scanner.nextInt();
            System.out.print("h = ");
            h = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
            return;
        }
        if (a > b) {
            System.out.println("Error! a > b");
            return;
        }
        if (h <= 0) {
            System.out.println("Error! h <= 0");
            return;
        }
        printFunctionValues(a, b, h);
    }
}
