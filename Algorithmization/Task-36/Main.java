package com.company;

import java.util.ArrayList;

public class Main {
    public static long getGreatestCommonDivisor(long a, long b) {
        return b == 0 ? a : getGreatestCommonDivisor(b, a % b);
    }
  
    public static Long getGreatestCommonDivisor(ArrayList<Long> values) {
        long result = values.get(0);
        for (Long value : values) {
            if (value > result) {
                result = getGreatestCommonDivisor(result, value);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Long> values = new ArrayList<>();
        values.add(3L);
        values.add(9L);
        values.add(12L);
        values.add(18L);
        System.out.println(getGreatestCommonDivisor(values));
    }
}
