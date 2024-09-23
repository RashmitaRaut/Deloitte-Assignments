package com.deloitte.lab1.ex2;
import java.util.Scanner;

public class Lab1Ex2 {

	public static void main(String[] args) {
		System.out.println("Lab 1 Exercise 2");
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select a traffic light:");
        System.out.println("1. Red");
        System.out.println("2. Yellow");
        System.out.println("3. Green");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Stop");
                break;
            case 2:
                System.out.println("Ready");
                break;
            case 3:
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }

        scanner.close();
    }

	}



