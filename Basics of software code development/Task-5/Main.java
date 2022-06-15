package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static String getTime(int seconds) {
        int hours = seconds / 3600;
        int minutes = seconds / 60 % 60;
        int sec = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, sec);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = 0;
        try {
            System.out.print("Seconds = ");
            seconds = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
            return;
        }
        System.out.println(getTime(seconds));
    }
}
