package com.goit.gojavaonline.practice.practicum3;

public class LongestStabilityPeriod {
    public int count(int[] gdp) {
        int counter = 0;

        int gdpLength = gdp.length - 3;

        if (gdp.length == 1) {
            counter = 1;
        } else if (gdp.length == 3) {
            counter = 2;
        } else if(gdp[gdp.length-1 ] >= gdp [0] && gdp[gdp.length-1] >= gdp [gdp.length-2]) {
            for (int i = 0; i < gdpLength; i++) {
                if ((gdp[i] <= gdp[0] + 1) ) {
                    counter += 1;
                }
            }
        } else {
            counter = 0;
            for (int j = 0; j < gdpLength; j++) {
                if (((gdp[j] + gdp[j + 1] + 2) == (gdp[j + 2] + gdp[j + 3])) && (gdp[j] == gdp[j + 1]) && (gdp[j + 2] == gdp[j + 3])) {
                    counter += 2;
                } else if (((gdp[j] + gdp[j + 1] - 2) == (gdp[j + 2] + gdp[j + 3])) && (gdp[j] == gdp[j + 1]) && (gdp[j + 2] == gdp[j + 3])) {
                    counter += 2;
                }
            }
        }
        return counter;
    }
}


