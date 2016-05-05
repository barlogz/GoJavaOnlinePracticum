package com.goit.gojavaonline.practice.practicum1;

import com.goit.gojavaonline.practice.practicum1.MatrixTraversal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(value = Parameterized.class)
public class MatrixTraversalTest {

    private final int[][] input;
    private final int[] expectedOutput;
    private MatrixTraversal matrixTraversal = new MatrixTraversal();

    public MatrixTraversalTest (int[][] input, int[] output){
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

        final int input3[][] = {
                {1, 2},
                {3, 4},

        };

        return Arrays.asList(new Object[][]{
                {input1, new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5}},
                {input2, new int[]{1, 4, 7, 10, 11, 12, 9, 6, 3, 2, 5, 8}},
                {input3, new int[]{1, 2, 4, 3}},
        });

    }

    @Test(timeout = 3000)
    public void testPrint() throws Exception {
        final int[] output = matrixTraversal.print(input);
        assertArrayEquals(expectedOutput, output);
    }


}