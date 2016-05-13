package com.goit.gojavaonline.practice.practicum3;

import java.util.LinkedList;

public class ReversePolishNotation {
    public int evaluate(String expression) {
        LinkedList<Integer> integers = new LinkedList<>();

        StringBuilder stringBuilder = new StringBuilder();

        char plus = '+';
        char minus = '-';
        char multiplier = '*';
        char divider = '/';

        if (expression.length()==1) {
            return Integer.parseInt(expression);
        }

        for (int i = 0; i < expression.length(); i++) {
            if (Character.isSpaceChar(expression.charAt(i))&& stringBuilder.length() > 0) {
                integers.add(Integer.parseInt(stringBuilder.toString()));
                stringBuilder.delete(0, stringBuilder.length());
            } else if (expression.charAt(i) == plus) {
                int calculate = integers.get(integers.size() - 2) + integers.get(integers.size()-1);
                integers.pollLast();
                integers.pollLast();
                integers.addLast(calculate);
            } else if (expression.charAt(i) == minus) {
                int calculate = integers.get(integers.size() - 2) - integers.get(integers.size()-1);
                integers.pollLast();
                integers.pollLast();
                integers.addLast(calculate);
            } else if (expression.charAt(i) == multiplier) {
                int calculate = integers.get(integers.size() - 2) * integers.get(integers.size()-1);
                integers.pollLast();
                integers.pollLast();
                integers.addLast(calculate);
            } else if (expression.charAt(i) == divider) {
                int calculate = integers.get(integers.size() - 2) / integers.get(integers.size()-1);
                 integers.pollLast();
                integers.pollLast();
                integers.addLast(calculate);
            } else if (Character.isDigit(expression.charAt(i))) {
                stringBuilder.append(expression.charAt(i));
            }
        }
        return Integer.parseInt(String.valueOf(integers.getFirst()));
    }
}