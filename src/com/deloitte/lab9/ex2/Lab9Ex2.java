package com.deloitte.lab9.ex2;

import java.util.Scanner;

public class Lab9Ex2 {

    public static void main(String[] args) {
        StringFormatter formatter = (str) -> {
            StringBuilder formatted = new StringBuilder();
            
            for (int i = 0; i < str.length(); i++) {
                formatted.append(str.charAt(i));
                
                if (i < str.length() - 1) {
                    formatted.append(" ");
                }
            }
            
            return formatted.toString();
        };
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = formatter.format(input);
        
        System.out.println("Formatted string: " + result);
        
        scanner.close();
    }

    interface StringFormatter {
        String format(String str);
    }
}

