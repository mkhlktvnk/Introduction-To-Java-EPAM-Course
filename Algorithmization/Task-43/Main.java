package com.company;

public class Main {
    public static double calculateRightTriangleArea(double a, double b) {
        return 0.5 * a * b;
    }

    public static double calculateQuadrilateralArea(double x, double y, double z, double t) {
        double d = Math.sqrt(x * x + y * y);
        double s1 = calculateRightTriangleArea(x, y);
        double s2 = 0.25 * Math.sqrt((d+z+t)*(d+z-t)*(d+t-z)*(z+t-d));
        return s1 + s2;
    }

    public static void main(String[] args) {
        System.out.println(calculateQuadrilateralArea(3, 2, 4, 6));
    }
}
