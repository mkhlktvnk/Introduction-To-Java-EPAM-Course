package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static ArrayList<Integer> createRandomArrayList(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrayList.add(10 + random.nextInt(20));
        }
        return arrayList;
    }

    public static void insert(ArrayList<Integer> first, ArrayList<Integer> second, int position) {
        for (Integer element : second) {
            first.add(position + 1, element);
            position++;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> first = createRandomArrayList(10);
        ArrayList<Integer> second = createRandomArrayList(15);
        System.out.println(first);
        System.out.println(second);
        insert(first, second, 0);
        System.out.println(first);
    }
}
