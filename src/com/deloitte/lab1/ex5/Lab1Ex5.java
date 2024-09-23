package com.deloitte.lab1.ex5;

public class Lab1Ex5 {

    
    public int calculateSum(int n) {
        int sum = 0;

        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i; 
            }
        }

        return sum; 
    }

    public static void main(String[] args) {
        
        Lab1Ex5 obj = new Lab1Ex5();

        int n = 10;

        int result = obj.calculateSum(n);
        System.out.println("Sum of numbers divisible by 3 or 5 up to " + n + " is: " + result);
    }
}
