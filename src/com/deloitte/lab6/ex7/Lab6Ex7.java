package com.deloitte.lab6.ex7;

import java.util.Arrays;
import java.util.Comparator;

public class Lab6Ex7 {

    public int[] getSorted(int[] arr) {
        String[] reversedStrings = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String reversed = new StringBuilder(Integer.toString(arr[i])).reverse().toString();
            reversedStrings[i] = reversed;
        }

        Integer[] reversedNumbers = new Integer[arr.length];
        for (int i = 0; i < reversedStrings.length; i++) {
            reversedNumbers[i] = Integer.parseInt(reversedStrings[i]);
        }

        Arrays.sort(reversedNumbers, Comparator.naturalOrder());

        int[] sortedArray = new int[reversedNumbers.length];
        for (int i = 0; i < reversedNumbers.length; i++) {
            sortedArray[i] = reversedNumbers[i];
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        int[] sampleArray = {123, 456, 789};

        Lab6Ex7 lab = new Lab6Ex7();

        int[] sortedArray = lab.getSorted(sampleArray);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
