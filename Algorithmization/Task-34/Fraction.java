package com.company;

public class Fraction {
    private long numerator;
    private long denominator;

    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setLeastCommonDenominator(long leastCommonDenominator) {
        numerator *= leastCommonDenominator / denominator;
        denominator = leastCommonDenominator;
    }

    @Override
    public String toString() {
        return String.format("%d / %d", numerator, denominator);
    }
}
