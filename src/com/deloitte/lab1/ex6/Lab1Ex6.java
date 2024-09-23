package com.deloitte.lab1.ex6;

public class Lab1Ex6 {

    public int calculateDifference(int n) {
        int sumOfSquares = 0; 
        int sum = 0; 

        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i; 
            sum += i; 
        }

        int squareOfSum = sum * sum;

        int difference = sumOfSquares - squareOfSum;

        return difference; 
    }

    public static void main(String[] args) {
        Lab1Ex6 obj = new Lab1Ex6();

        int n = 10;

        int result = obj.calculateDifference(n);
        System.out.println("The difference between the sum of squares and the square of the sum up to " + n + " is: " + result);
    }
}
