package com.goit.gojavaonline.practice.practicum3;

public class LongestStabilityPeriod {
    public int count(int[] gdp) {
        int counter, min, max;
        int result = 0;

        for (int i = 0; i < gdp.length; i++) {
            counter = 0;
            max = gdp[i];
            min = gdp[i];
            for (int j = i; j < gdp.length; j++) {
                if (Math.abs(gdp[i] - gdp[j]) > 1 && Math.abs(max - gdp[j]) > 1 &&Math.abs(min - gdp[j]) > 1) {
                counter = 0;
                continue;
                }
                if (max < gdp[j]){
                    max = gdp[j];
                }
                if (min > gdp[j]){
                    min = gdp[j];
                }
                if (Math.abs(max - gdp[j]) <= 1 && Math.abs(min - gdp[j]) <= 1){
                    counter++;
                } else{
                    break;
                }
            }
            if (counter > result){
                result = counter;
            }
        }
        return result;
    }
}