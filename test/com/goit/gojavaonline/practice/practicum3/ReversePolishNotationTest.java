package com.goit.gojavaonline.practice.practicum3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePolishNotationTest {
    ReversePolishNotation reversePolishNotation = new ReversePolishNotation();

    @Test
    public void testEvaluate() throws Exception {
        String expression =  "12 2 3 4 * 10 5 / + * +";
        int expected = 40;

        int actual = reversePolishNotation.evaluate(expression);
        assertEquals(expected, actual);
    }

    @Test
    public void testName() throws Exception {
        String expression =  "12 2 3 4 * 10 5 / + * +";

        System.out.println(expression.charAt(5));
        System.out.println(Character.isDigit(expression.charAt(5)));

    }
}