package com.deloitte.lab2.ex1;
import java.util.Arrays;

public class Lab2Ex1 {

    public int getSecondSmallest(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        Arrays.sort(array);

        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > smallest) {
                return array[i]; 
            }
        }

        throw new IllegalArgumentException("Array does not contain a second distinct smallest element.");
    }

    public static void main(String[] args) {
        Lab2Ex1 obj = new Lab2Ex1();

        int[] array = {5, 2, 8, 7, 1, 3, 1};

        try {
            int secondSmallest = obj.getSecondSmallest(array);
            System.out.println("The second smallest element is: " + secondSmallest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
