package com.goit.gojavaonline.practice.practicum2;

import java.util.Map;
import java.util.TreeMap;

public class AbcNumber {
    public static void main(String[] args) {
        System.out.println(convert("bcd"));
    }

    public static int convert(String num) {
        int numLength = num.length();
//        int temp = 0;

        StringBuilder resultFromMap = new StringBuilder();

        Map<Character, Integer> symbolCorrespondenceTable = new TreeMap<>();
        for (int i = 0; i < 10; i++) {
            symbolCorrespondenceTable.put((char) ('a' + i), i);
        }
//        for (int i = 0; i < 26; i++) {
//            symbolCorrespondenceTable.put((char) ('a' + i), i + 10);
//            symbolCorrespondenceTable.put((char) ('A' + i), i + 10);
//        }
        // Using charAt() method
        for (int i = 0; i < numLength; i++) {
            char ch = num.charAt(i);
            resultFromMap.append(symbolCorrespondenceTable.get(ch));
//            System.out.println(resultFromMap.append(symbolCorrespondenceTable.get(ch)));
        }
        return Integer.parseInt(resultFromMap.toString());
    }
}

//        for (int i = 0; i < aLength || i < bLength; i++) {
//            char aTemp = (i < aLength) ? a.charAt(aLength - 1 - i) : '0';
//            char bTemp = (i < bLength) ? b.charAt(bLength - 1 - i) : '0';
//            int sum = temp + symbolCorrespondenceTable.get(aTemp) + symbolCorrespondenceTable.get(bTemp);
//            if (sum < 36) {
//                resultFromMap.append(fromInt(sum));
//                temp = 0;
//            } else {
//                resultFromMap.append(fromInt(sum % 36));
//                temp = 1;
//            }
//        }
//
//        if (temp == 1) {
//            resultFromMap.append('1');
//        }
//        return resultFromMap.reverse().toString();
//    }
//
//    private char fromInt(int num) {
//        if (num < 10) {
//            return (char) ('0' + num);
//        } else {
//            return (char) ('a' + num - 10);
//        }
//
//    }
//}
