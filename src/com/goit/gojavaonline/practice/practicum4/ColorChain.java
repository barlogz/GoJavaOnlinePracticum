package com.goit.gojavaonline.practice.practicum4;

import java.util.HashMap;
import java.util.Map;

public class ColorChain {
    private Map<Integer, Integer> colorCombinations = new HashMap<>();

    public int count(int N) {
        if (N == 0 || N == 1) {
            return 1;
        } else if (N < 0) {
            return 0;
        }

        int white = colorCombinations.containsKey(N - 1) ? colorCombinations.get(N - 1) : count(N - 1);
        int yellow = colorCombinations.containsKey(N - 2) ? colorCombinations.get(N - 2) : count(N - 2);
        int black = colorCombinations.containsKey(N - 3) ? colorCombinations.get(N - 3) : count(N - 3);

        colorCombinations.put(N - 1, white);
        colorCombinations.put(N - 2, yellow);
        colorCombinations.put(N - 3, black);

        return white + yellow + black;
    }
}
