package com.company;

public class Main {
    public static double findRightTriangleArea(double a) {
        return (Math.pow(a, 2) * Math.sqrt(3)) / 4;
    }

    public static double findRegularHexagonArea(double a) {
        return 6 * findRightTriangleArea(a);
    }

    public static void main(String[] args) {
        System.out.println(findRegularHexagonArea(3));
    }
}
