package com.deloitte.lab6.ex6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab6Ex6 {

    
    public List<String> votersList(Map<String, Integer> people) {
        List<String> eligibleVoters = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            String id = entry.getKey();
            int age = entry.getValue();

            if (age > 18) {
                eligibleVoters.add(id);
            }
        }

        return eligibleVoters;
    }

    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("P001", 22);
        people.put("P002", 17);
        people.put("P003", 30);
        people.put("P004", 15);

        Lab6Ex6 lab = new Lab6Ex6();

        List<String> eligibleVoters = lab.votersList(people);
        System.out.println("Eligible Voters: " + eligibleVoters);
    }
}

