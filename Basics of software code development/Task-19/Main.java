package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        try {
            System.out.print("a = ");
            a = scanner.nextInt();
            System.out.print("b = ");
            b = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
            return;
        }
        char[] aChars = Integer.toString(a).toCharArray();
        char[] bChars = Integer.toString(b).toCharArray();
        ArrayList<Character> result = new ArrayList<>();
        for (char aChar : aChars) {
            for (char bChar : bChars) {
                if (aChar == bChar && !result.contains(aChar)) {
                    result.add(aChar);
                    System.out.println(aChar);
                }
            }
        }
    }
}
