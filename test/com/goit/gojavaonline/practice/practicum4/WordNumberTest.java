package com.goit.gojavaonline.practice.practicum4;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordNumberTest {
    private WordNumber wordNumber = new WordNumber();

    @Test
    public void testForOneLetter() throws Exception {
        String input = "a";
        int expected = 1;

        int actual = wordNumber.count(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testForTwoLetters() throws Exception {
        String input = "aA";
        int expected = 1;

        int actual = wordNumber.count(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testForTwoWords() throws Exception {
        String input = "aA AB";
        int expected = 2;

        int actual = wordNumber.count(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testForPunctuationSymbols() throws Exception {
        String input = "... ... !";
        int expected = 0;

        int actual = wordNumber.count(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testForTextWithSolidusSymbols() throws Exception {
        String input = "red/green/blue";
        int expected = 3;

        int actual = wordNumber.count(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testForTextWithParenthesisSymbols() throws Exception {
        String input = "\"public int find(int num) { \"";
        int expected = 5;

        int actual = wordNumber.count(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testForTextWithManySymbols() throws Exception {
        String input = "\"one.two:three four\\nfive(six)? ?:seven-eight\"";
        int expected = 8;

        int actual = wordNumber.count(input);
        assertEquals(expected, actual);
    }
}
