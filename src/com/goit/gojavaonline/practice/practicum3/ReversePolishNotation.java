package com.goit.gojavaonline.practice.practicum3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ReversePolishNotation {
    public int evaluate(String expression) {
        LinkedList<Integer> integers = new LinkedList<>();

        StringBuilder stringBuilder = new StringBuilder();

        char plus = '+';
        char minus = '-';
        char multiplier = '*';
        char divider = '/';
        int j = integers.size()-1;

        for (int i = 0; i < expression.length(); i++) {
            if (Character.isSpaceChar(expression.charAt(i))&& stringBuilder.length() > 0) {
                integers.add(Integer.parseInt(stringBuilder.toString()));
//                j++;
                stringBuilder.delete(0, stringBuilder.length());
            } else if (expression.charAt(i) == plus) {
                int calculate = (int) integers.get(integers.size() - 2) + (int) integers.get(integers.size()-1);
                integers.pollLast();
                integers.pollLast();
                integers.addLast(calculate);
//                integers.remove(j);
//                integers.remove(j - 1);
//                integers.set(j - 1, calculate);
//                j--;
            } else if (expression.charAt(i) == minus) {
                int calculate = (int) integers.get(integers.size() - 2) - (int) integers.get(integers.size()-1);
                integers.pollLast();
                integers.pollLast();
                integers.addLast(calculate);
//                integers.remove(j);
//                integers.remove(j - 1);
//                integers.set(j - 1, calculate);
//                j--;
            } else if (expression.charAt(i) == multiplier) {
                int calculate = (int) integers.get(integers.size() - 2) * (int) integers.get(integers.size()-1);
                integers.pollLast();
                integers.pollLast();
                integers.addLast(calculate);
//                integers.remove(integers.size());
//                integers.remove(j - 1);
//                integers.set(j - 1, calculate);
//                j--;
            } else if (expression.charAt(i) == divider) {
                int calculate = (int) integers.get(integers.size() - 2) / (int) integers.get(integers.size()-1);
                 integers.pollLast();
                integers.pollLast();
//               integers.remove(j - 1);
                integers.addLast(calculate);
//                j--;
            } else if (Character.isDigit(expression.charAt(i)) /*&& stringBuilder.length() > 0*/) {
                stringBuilder.append(expression.charAt(i));
//                break;
            }
        }
        return Integer.parseInt(String.valueOf(integers.getFirst()));
    }
}