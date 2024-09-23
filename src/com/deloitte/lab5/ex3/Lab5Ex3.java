package com.deloitte.lab5.ex3;

import java.util.Scanner;

public class Lab5Ex3 {

 public static void checkSalary(double salary) throws EmployeeException {
     if (salary < 3000) {
         // Throw custom exception if salary is below 3000
         throw new EmployeeException("Salary must be at least 3000.");
     } else {
         System.out.println("Salary is valid.");
     }
 }

 public static void main(String[] args) {
     // Create a Scanner object to get user input
     Scanner scanner = new Scanner(System.in);

     // Ask the user to enter the salary
     System.out.println("Enter employee salary:");
     double salary = scanner.nextDouble();

     // Check the salary and handle the custom exception
     try {
         checkSalary(salary);
     } catch (EmployeeException e) {
         // Print the exception message
         System.out.println("Error: " + e.getMessage());
     }
 }
}
