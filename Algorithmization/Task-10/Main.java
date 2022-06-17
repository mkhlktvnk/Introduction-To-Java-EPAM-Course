package com.company;

import java.util.*;

public class Main {
    public static void deleteEverySecondElement(int[] array) {
        int n = (array.length + 1) / 2;
        for (int i = 0; i < n; i++) {
           array[i] = array[i * 2];
        }
        for (int i = n; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(array));
        deleteEverySecondElement(array);
        System.out.println(Arrays.toString(array));
    }
}
