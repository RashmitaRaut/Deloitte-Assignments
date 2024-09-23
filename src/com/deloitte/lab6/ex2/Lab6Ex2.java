package com.deloitte.lab6.ex2;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex2 {

  
    public Map<Character, Integer> countChars(char[] arr) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : arr) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        return charCountMap;
    }

    public static void main(String[] args) {
        char[] sampleArray = {'a', 'b', 'a', 'c', 'b', 'a', 'd'};

        Lab6Ex2 lab = new Lab6Ex2();

        Map<Character, Integer> charCounts = lab.countChars(sampleArray);
        System.out.println("Character Counts: " + charCounts);
    }
}

