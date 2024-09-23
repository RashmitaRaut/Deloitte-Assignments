package com.deloitte.lab3.ex9;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab3Ex9 {

    public static void printDuration(LocalDate inputDate) {
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(inputDate, currentDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Duration: " + years + " years, " + months + " months, and " + days + " days.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a date (yyyy-mm-dd):");
        String input = sc.nextLine();

        LocalDate inputDate = LocalDate.parse(input);

        printDuration(inputDate);
    }
}

