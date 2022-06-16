package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static double function(double x) {
        return x <= 3 ? Math.pow(x, 2) - 3 * x + 9 : 1 / (Math.pow(x, 3) + 6);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 0;
        try {
            System.out.print("x = ");
            x = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
            return;
        }
        System.out.printf("F(%f) = %f", x, function(x));
    }
}
