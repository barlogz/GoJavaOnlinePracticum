package com.goit.gojavaonline.practice.practicum3;

import java.util.ArrayList;
import java.util.List;

public class RectangleSquare {
    public int measure(int[] x, int[] h, int[] w) {
        int result= 0;
        List<Integer> commonSquare = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            int newSize = x[i] + w[i];
            if (commonSquare.size() < newSize) {
                for (int k = commonSquare.size(); k < newSize; k++) {
                    commonSquare.add(0);
                }
            }
            for (int j = 0; j < w[i]; j++) {
                if (commonSquare.get(x[i] + j) < h[i]) {
                    commonSquare.set(x[i] + j, h[i]);
                }
            }
        }
        for (int square : commonSquare) {
            result += square;
        }
        return result;
    }
}