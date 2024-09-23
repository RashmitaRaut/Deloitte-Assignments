package com.deloitte.lab1.ex4;
import java.util.Scanner;

public class Lab1Ex4 {

    public static void main(String[] args) {
       System.out.println("Lab 1 Exercise 4");
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("Prime numbers up to " + number + ":");
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
