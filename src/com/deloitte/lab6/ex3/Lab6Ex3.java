package com.deloitte.lab6.ex3;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex3 {

    public Map<Integer, Integer> getSquares(int[] numbers) {
        Map<Integer, Integer> squaresMap = new HashMap<>();

        for (int number : numbers) {
            int square = number * number;
            squaresMap.put(number, square);
        }

        return squaresMap;
    }

    public static void main(String[] args) {
        int[] sampleNumbers = {1, 2, 3, 4, 5};

        Lab6Ex3 lab = new Lab6Ex3();

        Map<Integer, Integer> squares = lab.getSquares(sampleNumbers);
        System.out.println("Number and their squares: " + squares);
    }
}
