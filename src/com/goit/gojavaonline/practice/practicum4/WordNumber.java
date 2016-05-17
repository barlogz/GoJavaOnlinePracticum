package com.goit.gojavaonline.practice.practicum4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordNumber {
    public int count(String input) {
        HashMap<Character, Character> letters = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        List<String> words = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            letters.put(c, '+');
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            letters.put(c, '+');
        }
        if (input.length()==0)
            return 0;
        if (input.length()==1 && letters.containsKey(input.charAt(0)))
            return 1;

        for (int i = 0; i < input.length(); i++) {
            if (letters.containsKey(input.charAt(i))) {
                stringBuilder.append(input.charAt(i));
            } else if (stringBuilder.length() > 0) {
                words.add(stringBuilder.toString());
                stringBuilder.delete(0, stringBuilder.length());
            }
        }
        if (stringBuilder.length() > 0)
            words.add( stringBuilder.toString());
        stringBuilder.delete(0,stringBuilder.length());

        return words.size();
    }
}