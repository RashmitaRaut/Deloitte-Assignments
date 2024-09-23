package com.deloitte.lab5.ex1;

import java.util.Scanner;

//User-defined exception for invalid age
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class Lab5Ex1 {

 public static void validateAge(int age) throws InvalidAgeException {
     if (age < 15) {
         throw new InvalidAgeException("Age must be above 15.");
     } else {
         System.out.println("Age is valid.");
     }
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter your age:");
     int age = scanner.nextInt();

     try {
         validateAge(age);
     } catch (InvalidAgeException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}
