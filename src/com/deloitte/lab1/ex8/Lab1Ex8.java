package com.deloitte.lab1.ex8;

public class Lab1Ex8 {

    public boolean checkNumber(int n) {
        
        if (n <= 0) {
            return false;         }

        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Lab1Ex8 obj = new Lab1Ex8();

        int number = 8;

        boolean result = obj.checkNumber(number);
        if (result) {
            System.out.println(number + " is a power of two.");
        } else {
            System.out.println(number + " is not a power of two.");
        }
    }
}

