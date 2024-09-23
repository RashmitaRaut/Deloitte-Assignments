package com.deloitte.lab5.ex2;

import java.util.Scanner;

class InvalidNameException extends Exception {
 public InvalidNameException(String message) {
     super(message);
 }
}

public class Lab5Ex2 {

 public static void validateFullName(String firstName, String lastName) throws InvalidNameException {
     if (firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
         throw new InvalidNameException("First name and last name cannot be blank.");
     } else {
         System.out.println("Full name is valid.");
     }
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter your first name:");
     String firstName = scanner.nextLine();

     System.out.println("Enter your last name:");
     String lastName = scanner.nextLine();

     try {
         validateFullName(firstName, lastName);
     } catch (InvalidNameException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}
