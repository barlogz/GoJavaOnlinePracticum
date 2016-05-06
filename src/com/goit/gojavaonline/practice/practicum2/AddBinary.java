package com.goit.gojavaonline.practice.practicum2;

public class AddBinary {
    String add(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        int max = Math.max(lengthA, lengthB);
        int temp = 0;

        StringBuilder sum = new StringBuilder("");

        for (int i = 0; i < max; i++) {
            int m = getBit(a, lengthA - i - 1);
            int n = getBit(b, lengthB - i - 1);
            int add = m + n + temp;
            sum.append(add % 2);
            temp = add / 2;
        }
        if (temp == 1)
            sum.append("1");

        return sum.reverse().toString();
    }

    public int getBit(String s, int index) {
        if (index < 0 || index >= s.length())
            return 0;

        if (s.charAt(index) == '0')
            return 0;
        else
            return 1;
    }
}