package com.deloitte.lab2.ex4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lab2Ex4 {

    public int[] modifyArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }

        Integer[] uniqueArray = uniqueSet.toArray(new Integer[0]);

        Arrays.sort(uniqueArray, (a, b) -> b - a);

        int[] sortedArray = Arrays.stream(uniqueArray).mapToInt(Integer::intValue).toArray();

        return sortedArray; 
    }

    public static void main(String[] args) {
        Lab2Ex4 obj = new Lab2Ex4();

        int[] arr = {5, 3, 9, 1, 5, 2, 9, 6, 2};

        int[] result = obj.modifyArray(arr);
        System.out.println("Array after removing duplicates and sorting in descending order:");
        for (int num : result) {
            System.out.println(num);
        }
    }
}

