package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static double function(double x, double y) {
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 0.0, y = 0.0;
        try {
            System.out.print("x = ");
            x = scanner.nextDouble();
            System.out.print("y = ");
            y = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.print("Incorrect input!");
            return;
        }
        System.out.println("Result = " + function(x, y));
    }
}
