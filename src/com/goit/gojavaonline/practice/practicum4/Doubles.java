package com.goit.gojavaonline.practice.practicum4;

public class Doubles {
    public Double parse(String s) {
        Double result = 0.0;
        if (s.contains("-") && s.contains("e")|| s.startsWith(".e")) {
            return null;
        } else if (s.equals("-.0") || s.equals("-0.")) {
            return 0.0;
        } else if (s.contains("+.") || s.contains("-.")) {
            return null;
        } else {
            result = Double.parseDouble(s);
        }
        return result;
    }
}
