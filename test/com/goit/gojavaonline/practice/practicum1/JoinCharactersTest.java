package com.goit.gojavaonline.practice.practicum1;

import com.goit.gojavaonline.practice.practicum1.JoinCharacters;
import org.junit.Assert;
import org.junit.Test;

public class JoinCharactersTest {
    JoinCharacters joinCharacters = new JoinCharacters();

    @Test
    public void testSingleElementArray() throws Exception {
        char[] input = {'1'};
        int expected = 1;

        int actualResult = joinCharacters.join(input);
        Assert.assertEquals("Characters should be joined correctly for single element array", expected, actualResult);
    }

    @Test
    public void testThreeElementsArray() throws Exception {
        char[] input = {'1','2','3'};
        int expected = 123;

        int actualResult = joinCharacters.join(input);
        Assert.assertEquals("Characters should be joined correctly for three elements array", expected, actualResult);
    }

    @Test
    public void testSingleElementArrayWithZero() throws Exception {
        char[] input = {'0'};
        int expected = 0;

        int actualResult = joinCharacters.join(input);
        Assert.assertEquals("Characters should be joined correctly for single element array", expected, actualResult);
    }
}

