package com.deloitte.lab2.ex2;

import java.util.Arrays;

public class Lab2Ex2 {

    public String[] sortStrings(String[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        Arrays.sort(arr);

        int length = arr.length;
        int mid = (length + 1) / 2; 

        for (int i = 0; i < length; i++) {
            if (i < mid) {
                arr[i] = arr[i].toUpperCase();
            } else {
                arr[i] = arr[i].toLowerCase();
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Lab2Ex2 obj = new Lab2Ex2();

        String[] arr = {"banana", "Apple", "cherry", "date", "fig", "grape"};

        String[] sortedArr = obj.sortStrings(arr);
        System.out.println("Sorted and case-modified array:");
        for (String str : sortedArr) {
            System.out.println(str);
        }
    }
}

