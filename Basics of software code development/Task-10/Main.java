package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static boolean isSizeSuitable(double a, double b, double x, double y, double z) {
        return a * b == x * y || a * b == y * z || a * b == x * z;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0, b = 0;
        double x = 0, y = 0, z = 0;
        try {
            System.out.print("a = ");
            a = scanner.nextDouble();
            System.out.print("b = ");
            b = scanner.nextDouble();
            System.out.print("x = ");
            x = scanner.nextDouble();
            System.out.print("y = ");
            y = scanner.nextDouble();
            System.out.print("z = ");
            z = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
            return;
        }
        if (isSizeSuitable(a, b, x, y, z)) {
            System.out.println("The brick will go through the hole.");
        } else {
            System.out.println("The brick will not go through the hole");
        }
    }
}
