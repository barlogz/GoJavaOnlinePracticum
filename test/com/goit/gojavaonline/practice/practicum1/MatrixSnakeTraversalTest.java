package com.goit.gojavaonline.practice.practicum1;

import com.goit.gojavaonline.practice.practicum1.MatrixSnakeTraversal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class MatrixSnakeTraversalTest {

    private final int[][] input;
    private final int[] expectedOutput;
    private MatrixSnakeTraversal matrixSnakeTraversal = new MatrixSnakeTraversal();

    public MatrixSnakeTraversalTest(int[][] input, int[] output) {
        this.input = input;
        this.expectedOutput = output;
    }

    @Parameterized.Parameters(name = "for input[][]{index}")
    public static Collection<Object[]> data() {
        final int input1[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        final int input2[][] = {
                {1, 4, 7, 10},
                {2, 5, 8, 11},
                {3, 6, 9, 12}
        };

        return Arrays.asList(new Object[][]{
                {input1, new int[]{1, 4, 7, 8, 5, 2, 3, 6, 9}},
                {input2, new int[]{1, 2, 3, 6, 5, 4, 7, 8, 9, 12, 11, 10}},
        });

    }

    @Test(timeout = 1000)
    public void testPrint() throws Exception {
        final int[] output = matrixSnakeTraversal.print(input);
        assertArrayEquals(expectedOutput, output);
    }
}