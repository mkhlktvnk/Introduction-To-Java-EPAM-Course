package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static boolean isOnTheSameLine(double x1, double y1, double x2, double y2, double x3, double y3) {
        return ((y3 - y1) / (y2 - y1)) == ((x3 - x1) / (x2 - x1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = 0.0, y1 = 0.0;
        double x2 = 0.0, y2 = 0.0;
        double x3 = 0.0, y3 = 0.0;
        try {
            System.out.print("x1 = ");
            x1 = scanner.nextDouble();
            System.out.print("y1 = ");
            y1 = scanner.nextDouble();
            System.out.print("x2 = ");
            x2 = scanner.nextDouble();
            System.out.print("y2 = ");
            y2 = scanner.nextDouble();
            System.out.print("x3 = ");
            x3 = scanner.nextDouble();
            System.out.print("y3 = ");
            y3 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
            return;
        }
        System.out.println("On the same line: " + isOnTheSameLine(x1, y1, x2, y2, x3, y3));
    }
}
