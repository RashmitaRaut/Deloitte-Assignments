package com.deloitte.lab3.ex8;

public class Lab3Ex8 {

    public static boolean isPositiveString(String input) {
        input = input.toLowerCase();

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) > input.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "ANT";
        boolean result = isPositiveString(input);

        if (result) {
            System.out.println(input + " is a positive string.");
        } else {
            System.out.println(input + " is not a positive string.");
        }
    }
}

