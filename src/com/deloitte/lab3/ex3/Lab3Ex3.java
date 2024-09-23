package com.deloitte.lab3.ex3;

public class Lab3Ex3 {
    
    public static String alterString(String input) {
        char[] chars = input.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            if (isConsonant(chars[i])) {
                chars[i] = (char)(chars[i] + 1);
            }
        }
        
        return new String(chars);
    }

    public static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);

        return (ch >= 'a' && ch <= 'z') && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void main(String[] args) {
        String input = "JAVA";
        String result = alterString(input);

        System.out.println("Output: " + result);
    }
}
