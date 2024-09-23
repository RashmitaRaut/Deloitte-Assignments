package com.deloitte.lab9.ex5;

public class Lab9Ex5 {

 public static void main(String[] args) {
     Lab9Ex5 obj = new Lab9Ex5();

     FactorialCalculator calculator = obj::calculateFactorial;

     int number = 5;
     int result = calculator.getFactorial(number);

     System.out.println("Factorial of " + number + " is: " + result);
 }

 public int calculateFactorial(int num) {
     int fact = 1;
     for (int i = 1; i <= num; i++) {
         fact *= i;
     }
     return fact;
 }
 interface FactorialCalculator {
     int getFactorial(int num);
 }
}

