package com.deloitte.lab5.ex3;

import java.util.Scanner;

public class Lab5Ex3 {

 public static void checkSalary(double salary) throws EmployeeException {
     if (salary < 3000) {
         
         throw new EmployeeException("Salary must be at least 3000.");
     } else {
         System.out.println("Salary is valid.");
     }
 }

 public static void main(String[] args) {
     
     Scanner scanner = new Scanner(System.in);

    
     System.out.println("Enter employee salary:");
     double salary = scanner.nextDouble();

     
     try {
         checkSalary(salary);
     } catch (EmployeeException e) {
        
         System.out.println("Error: " + e.getMessage());
     }
 }
}
