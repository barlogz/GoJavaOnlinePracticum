package com.goit.gojavaonline.practice.practicum3;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnixPathTest {
    public static UnixPath unixPath = new UnixPath();

    @Test
    public void testStringBuilder() {
        StringBuilder sb = new StringBuilder();
        String str = "abcde";
        sb.append(str.charAt(2));
        sb.append(str.charAt(3));
        assertEquals("cd", sb.toString());

        sb.delete(0, sb.length());
        assertEquals(0, sb.length());
    }

    @Test
    public void testSimplify1() {
        String input = "/var//lib";
        String expected = "/var/lib";

        assertEquals(expected, unixPath.simplify(input));
    }

    @Test
    public void testSimplify2() {
        String input = "/.";
        String expected = "/";

        assertEquals(expected, unixPath.simplify(input));
    }

    @Test
    public void testSimplify3() {
        String input = "/var//lib/";
        String expected = "/var/lib";

        assertEquals(expected, unixPath.simplify(input));
    }

    @Test
    public void testSimplify4() {
        String input = "/var/lib/../log/./../tmp/data///.";
        String expected = "/var/tmp/data";

        assertEquals(expected, unixPath.simplify(input));
    }

    @Test
    public void testSimplify5() {
        String input = "/home/../var/./lib//file.txt";
        String expected = "/var/lib/file.txt";

        assertEquals(expected, unixPath.simplify(input));
    }
}