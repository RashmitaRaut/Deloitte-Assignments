package com.deloitte.lab1.ex7;

public class Lab1Ex7 {

    public boolean checkNumber(int number) {
        String numStr = Integer.toString(number);

        for (int i = 1; i < numStr.length(); i++) {
            if (numStr.charAt(i) < numStr.charAt(i - 1)) {
                return false;  
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        Lab1Ex7 obj = new Lab1Ex7();

        int number = 168;

        boolean result = obj.checkNumber(number);
        if (result) {
            System.out.println(number + " is an increasing number.");
        } else {
            System.out.println(number + " is not an increasing number.");
        }
    }
}

