package com.deloitte.lab2.ex3;

import java.util.Arrays;

public class Lab2Ex3 {

    public int[] getSorted(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        Integer[] reversedArray = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String numStr = Integer.toString(arr[i]);
            String reversedStr = new StringBuilder(numStr).reverse().toString();
            reversedArray[i] = Integer.parseInt(reversedStr);
        }

        Arrays.sort(reversedArray);

        int[] sortedArray = Arrays.stream(reversedArray).mapToInt(Integer::intValue).toArray();

        return sortedArray; 
    }

    public static void main(String[] args) {
        Lab2Ex3 obj = new Lab2Ex3();

        int[] arr = {123, 456, 789, 321, 654};

        int[] sortedArr = obj.getSorted(arr);
        System.out.println("Reversed and sorted array:");
        for (int num : sortedArr) {
            System.out.println(num);
        }
    }
}

