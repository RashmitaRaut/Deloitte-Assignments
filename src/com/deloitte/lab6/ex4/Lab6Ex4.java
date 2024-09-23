package com.deloitte.lab6.ex4;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex4 {

    public Map<String, String> getStudents(Map<String, Integer> studentMarks) {
        Map<String, String> studentMedals = new HashMap<>();

        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            String registrationNumber = entry.getKey();
            int marks = entry.getValue();
            String medal;

            if (marks >= 90) {
                medal = "Gold";
            } else if (marks >= 80) {
                medal = "Silver";
            } else if (marks >= 70) {
                medal = "Bronze";
            } else {
                medal = "No Medal"; 
            }

            studentMedals.put(registrationNumber, medal);
        }

        return studentMedals;
    }

    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("S001", 95);
        studentMarks.put("S002", 85);
        studentMarks.put("S003", 72);
        studentMarks.put("S004", 60);

        Lab6Ex4 lab = new Lab6Ex4();

        Map<String, String> studentMedals = lab.getStudents(studentMarks);
        System.out.println("Student Medals: " + studentMedals);
    }
}
