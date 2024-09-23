package com.deloitte.lab1.ex1;

public class Lab1Ex1 {

	public static int sumOfCubes(int number) {
		System.out.println("Lab 1 Exercise 1");
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;  
            sum += digit * digit * digit;  
            number /= 10;  
        }

        return sum;
    }

	public static void main(String[] args) {
		int number = 12;  
        System.out.println("Sum of cubes of digits: " + sumOfCubes(number));

	}

}


