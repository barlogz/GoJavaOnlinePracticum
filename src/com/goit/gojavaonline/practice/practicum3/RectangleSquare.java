package com.goit.gojavaonline.practice.practicum3;

public class RectangleSquare {
    public int measure(int[] x, int[] h, int[] w) {

        int[] heightSideLength = new int[h.length];
        for (int i = 0; i < heightSideLength.length; i++) {
            heightSideLength[i] = h[i] + x[i];
        }
//        int[] widthSideLength = new int[w.length];
//        for (int i = 0; i < widthSideLength.length; i++) {
//            widthSideLength[i] = w[i] - x[i];
//        }
//        int[] myArray = new int[]{1, 3, 8, 5, 7, };
        int maxHeight = 0;
        for(int i = 0; i < heightSideLength.length; i++) {
            if(heightSideLength[i] > maxHeight) {
                maxHeight = heightSideLength[i];
            }
        }
        int maxWidth = 0;
        for(int i = 0; i < w.length; i++) {
            if(w[i] > maxWidth) {
                maxWidth = w[i];
            }
        }
        int minHeight = Integer.MAX_VALUE;
        for(int i = 0; i < heightSideLength.length; i++) {
            if(heightSideLength[i] < minHeight) {
                minHeight = heightSideLength[i];
            }
        }
        int minWidth = Integer.MAX_VALUE;
        for(int i = 0; i < w.length; i++) {
            if(w[i] < minWidth) {
                minWidth = w[i];
            }
        }
        int maxXIndex = 0;
        for (int i = 1; i < x.length; i++) {
            int tempXPoint = x[i];
            if ((tempXPoint > x[maxXIndex])) {
                maxXIndex = i;
            }
        }

        int minXIndex = 0;
        for (int i = 1; i < x.length; i++) {
            int tempXPoint = x[i];
            if ((tempXPoint < x[minXIndex])) {
                minXIndex = i;
            }
        }

        int multipliedMinimumValuesSides = minHeight * minWidth;
        int multipliedMaximumValuesSides = maxHeight * maxWidth;

        int multipliedByMaxXValue = w[maxXIndex] * ((x[maxXIndex] - x[minXIndex]) + h[maxXIndex]);
        int multipliedByMinXValue = w[minXIndex] * h[minXIndex];

        int sumOfMultipliedByXValue = multipliedByMaxXValue + multipliedByMinXValue;



        int result = sumOfMultipliedByXValue - multipliedMinimumValuesSides;
//        int result = multipliedMaximumValuesSides - multipliedMinimumValuesSides;


        return result;
    }
}
