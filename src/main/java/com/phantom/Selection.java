package com.phantom;

public class Selection {
    public static void minSelectionSort(int[] inputData, int length) {
        int tmp;
        int min;
        for(int i=0; i < length-1; i++) {
            min = i;
            for(int j=i+1; j < length; j++) {
                if(inputData[j] < inputData[min]) {
                    min = j;
                }
            }
            tmp = inputData[i];
            inputData[i] = inputData[min];
            inputData[min] = tmp;
        }
    }
}
