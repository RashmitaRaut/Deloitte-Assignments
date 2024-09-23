package com.deloitte.lab6.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab6Ex1 {

    public <T extends Comparable<T>> List<T> getValues(HashMap<?, T> map) {
        List<T> valuesList = new ArrayList<>(map.values());

        Collections.sort(valuesList);

        return valuesList;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("one", 1);
        sampleMap.put("three", 3);
        sampleMap.put("two", 2);

        Lab6Ex1 lab = new Lab6Ex1();

        List<Integer> sortedValues = lab.getValues(sampleMap);
        System.out.println("Sorted Values: " + sortedValues);
    }
}

