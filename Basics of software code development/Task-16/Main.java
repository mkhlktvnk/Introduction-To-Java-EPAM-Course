package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        double e = 0;
        try {
            System.out.print("n = ");
            n = scanner.nextInt();
            System.out.print("e = ");
            e = scanner.nextDouble();
        } catch (InputMismatchException exception) {
            System.out.println("Incorrect input!");
            return;
        }
        if (n <= 0) {
            System.out.println("Error! n <= 0.");
            return;
        }
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            double a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }
        System.out.println("sum = " + sum);
    }
}
