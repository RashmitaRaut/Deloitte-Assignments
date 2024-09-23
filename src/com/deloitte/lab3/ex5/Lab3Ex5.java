package com.deloitte.lab3.ex5;
import java.util.Scanner;

public class Lab3Ex5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter text (type 'exit' on a new line to stop):");
        StringBuilder text = new StringBuilder();
        String line;
        
        while (!(line = scanner.nextLine()).equals("exit")) {
            text.append(line).append("\n");
        }
        
        String inputText = text.toString();
        
        int charCount = inputText.length();
        
        String[] lines = inputText.split("\n");
        int lineCount = lines.length;

        String[] words = inputText.split("\\s+"); 
        int wordCount = words.length;
        
        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
    }
}

