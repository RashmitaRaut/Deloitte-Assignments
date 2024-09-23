package com.deloitte.lab9.ex1;

import java.util.Scanner;

public class Lab9Ex1 {

    public static void main(String[] args) {
        PowerFunction power = (x, y) -> Math.pow(x, y);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();
        
        System.out.print("Enter the value of y: ");
        double y = scanner.nextDouble();
        
        double result = power.calculate(x, y);
        
        System.out.println(x + " raised to the power of " + y + " is: " + result);
        
        scanner.close();
    }

    interface PowerFunction {
        double calculate(double x, double y);
    }
}
