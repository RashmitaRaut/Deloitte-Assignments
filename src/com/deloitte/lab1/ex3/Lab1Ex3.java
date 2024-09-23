package com.deloitte.lab1.ex3;

import java.util.Scanner;

public class Lab1Ex3 {
	public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1, fib = 1;
        for (int i = 2; i <= n; i++) {
            fib = a + b;  
            a = b;        
            b = fib;
        }
        return fib;
    }
	public static void main(String[] args ) {
		System.out.println("Lab 1 Exercise 3");
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the position of Fibonacci number: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci number (Recursive): " + fibonacciRecursive(n));

        System.out.println("Fibonacci number (Iterative): " + fibonacciIterative(n));

        scanner.close();
	}
	

}
