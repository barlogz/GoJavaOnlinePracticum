package com.goit.gojavaonline.practice.practicum2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddNumberBase36Test {
    AddNumberBase36 addNumberBase36 = new AddNumberBase36();

    @Test
    public void testAddingOfTwoNumbers() throws Exception {
        String a = "9";
        String b = "1";
        String expected = "a";
        System.out.println(a.length());
        System.out.println(b.length());
        String str = "bcd";
        for(int i=0; i<str.length();i++) {
            char ch = str.charAt(i);
            System.out.println("Character at " + i + " Position: " + ch);
        }
        String actual = addNumberBase36.add(a, b);
        assertEquals("9 & 1 are summed incorrect", expected, actual);

    }
    @Test
    public void testAddingOfNumberAndLetter() throws Exception {
        String a = "z";
        String b = "1";
        String expected = "10";

        String actual = addNumberBase36.add(a, b);
        assertEquals("z & 1 are summed incorrect", expected, actual);

    }

    @Test (timeout = 5)
    public void testAddingOfTwoLetters() throws Exception {
        String a = "z";
        String b = "z";
        String expected = "1y";

        String actual = addNumberBase36.add(a, b);
        assertEquals("z & z are summed incorrect", expected, actual);

    }

}