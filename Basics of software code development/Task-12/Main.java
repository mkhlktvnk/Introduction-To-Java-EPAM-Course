package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int getSum(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        try {
            System.out.print("x(x >= 1) = ");
            x = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
        }
        if (x < 1) {
            System.out.println("x should be >= 1!");
            return;
        }
        System.out.printf("Sum from 1 to %d = %d", x, getSum(x));
    }
}
