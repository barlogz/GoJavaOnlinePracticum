package com.goit.gojavaonline.practice.practicum2;

import java.util.Map;
import java.util.TreeMap;

public class AbcNumber {
    public static void main(String[] args) {
        System.out.println(convert("bcd"));
    }

    public static int convert(String num) {
        int numLength = num.length();

        StringBuilder resultFromMap = new StringBuilder();

        Map<Character, Integer> symbolCorrespondenceTable = new TreeMap<>();
        for (int i = 0; i < 10; i++) {
            symbolCorrespondenceTable.put((char) ('a' + i), i);
        }
        for (int i = 0; i < numLength; i++) {
            char ch = num.charAt(i);
            resultFromMap.append(symbolCorrespondenceTable.get(ch));
        }
        return Integer.parseInt(resultFromMap.toString());
    }
}
