package com.deloitte.lab6.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab6Ex5 {

    public int getSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        Collections.sort(list);

        return list.get(1); // Since list is sorted, the second element is the second smallest
    }

    public static void main(String[] args) {
        // Create a sample array for testing
        int[] sampleArray = {4, 2, 7, 1, 3};

        Lab6Ex5 lab = new Lab6Ex5();

        int secondSmallest = lab.getSecondSmallest(sampleArray);
        System.out.println("Second Smallest Element: " + secondSmallest);
    }
}

