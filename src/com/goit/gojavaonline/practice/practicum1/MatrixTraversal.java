package com.goit.gojavaonline.practice.practicum1;

public class MatrixTraversal {
    public int[] print(int[][] input) {
        if (input == null || input.length == 0 || input[0].length == 0) return new int[0];
        int rowLength = input.length;
        int columnLength = input[0].length;
        int[] output = new int[rowLength * columnLength];
        if (columnLength == 1) {
            output[0] = input[0][0];
            return output;
        }

        int numberOfSteps = 0;
        int row = 0;
        int column = 0;
        int arrayIndex = 0;

        int arrayElementsQuantity = rowLength * columnLength - 1;

        while (arrayIndex <= arrayElementsQuantity) {

            while (column < columnLength - 1) {
                output[arrayIndex++] = input[row][column];
                column++;
            }
            while (row < rowLength - 1) {
                output[arrayIndex++] = input[row][column];
                row++;
            }
            while (column > numberOfSteps) {
                output[arrayIndex++] = input[row][column];
                column--;
            }
            columnLength--;
            rowLength--;
            numberOfSteps++;

            while (row > numberOfSteps) {
                output[arrayIndex++] = input[row][column];
                row--;
            }
            if (arrayIndex == arrayElementsQuantity) {
                output[arrayIndex++] = input[row][column];
            }

        }
        return output;
    }
}