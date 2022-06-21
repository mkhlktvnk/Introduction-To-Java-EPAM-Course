package com.company;

import java.util.ArrayList;

public class Main {
    public static int getSum(ArrayList<Integer> sequence, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Error! Start index greater than end");
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += sequence.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            sequence.add(i + 1);
        }
        System.out.println(sequence);
        System.out.println(getSum(sequence, 0, 2));
        System.out.println(getSum(sequence, 2, 4));
        System.out.println(getSum(sequence, 3, 5));
    }
}
