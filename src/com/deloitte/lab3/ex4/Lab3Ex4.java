package com.deloitte.lab3.ex4;

public class Lab3Ex4 {

    public static int modifyNumber(int number1) {
        String numberStr = Integer.toString(number1);

        StringBuffer modifiedNumber = new StringBuffer();

        for (int i = 0; i < numberStr.length() - 1; i++) {
            int currentDigit = Character.getNumericValue(numberStr.charAt(i));
            int nextDigit = Character.getNumericValue(numberStr.charAt(i + 1));

            int difference = Math.abs(currentDigit - nextDigit);

            modifiedNumber.append(difference);
        }

        modifiedNumber.append(numberStr.charAt(numberStr.length() - 1));

        return Integer.parseInt(modifiedNumber.toString());
    }

    public static void main(String[] args) {
        int input = 45862;
        int result = modifyNumber(input);

        System.out.println("Output: " + result);
    }
}
