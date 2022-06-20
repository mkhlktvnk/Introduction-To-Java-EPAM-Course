package com.company;

import java.util.*;

public class Main {
    public static ArrayList<Integer> generateRandomArrayList(Integer size) {
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrayList.add(-1000 + random.nextInt(2000));
        }
        return arrayList;
    }

    public static ArrayList<Integer> findIndexesWhereToInsert(ArrayList<Integer> first, ArrayList<Integer> second) {
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < second.size(); i++) {
            int key = Collections.binarySearch(first, second.get(i));
            if (key < 0) {
                indexes.add(i - (key + 1));
            } else {
                indexes.add(key + i);
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        ArrayList<Integer> first = generateRandomArrayList(10);
        ArrayList<Integer> second = generateRandomArrayList(20);
        first.sort(Comparator.comparingInt(a -> a));
        second.sort(Comparator.comparingInt(a -> a));
        System.out.println(first);
        System.out.println(second);
        ArrayList<Integer> indexes = findIndexesWhereToInsert(first, second);
        System.out.println(indexes);
    }
}
