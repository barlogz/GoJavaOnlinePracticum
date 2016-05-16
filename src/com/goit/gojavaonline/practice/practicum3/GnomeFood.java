package com.goit.gojavaonline.practice.practicum3;

public class GnomeFood {
    public int[] find(int[] gnomes, int[] portions) {
        int[] gnomesPriority = new int[gnomes.length];
        for (int ignored : gnomes) gnomesPriority[arrangeIndexOfMaxValue(gnomes)] = arrangeIndexOfMaxValue(portions);
        return gnomesPriority;
    }

    private int arrangeIndexOfMaxValue(int[] array) {
        int indexOfMaxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[indexOfMaxValue]) {
                indexOfMaxValue = i;
            }
        }
        array[indexOfMaxValue] = 0;
        return indexOfMaxValue;
    }
}