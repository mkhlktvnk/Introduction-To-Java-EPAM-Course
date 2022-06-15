package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static boolean isTriangleExists(double firstCorner, double secondCorner) {
        return 180 - (firstCorner + secondCorner) > 0;
    }

    public static boolean isTriangleRightAngled(double firstCorner, double secondCorner) {
        return firstCorner == 90 || secondCorner == 90 || 180 - (firstCorner + secondCorner) == 90;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firsCorner, secondCorner = 0.0;
        try {
            System.out.print("first corner = ");
            firsCorner = scanner.nextDouble();
            System.out.print("second corner = ");
            secondCorner = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
            return;
        }
        if (isTriangleExists(firsCorner, secondCorner)) {
            System.out.println("Triangle exists.");
        } else {
            System.out.println("Triangle does not exists.");
            return;
        }
        if (isTriangleRightAngled(firsCorner, secondCorner)) {
            System.out.println("Triangle is right angled.");
        } else {
            System.out.println("Triangle is not right angled.");
        }
    }
}
