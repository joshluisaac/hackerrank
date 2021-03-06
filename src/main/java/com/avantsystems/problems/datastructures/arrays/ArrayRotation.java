package com.avantsystems.problems.datastructures.arrays;

import java.util.Arrays;

public class ArrayRotation {

    static int[] rotateArray(int[] arr,final int d) {
        final int n = arr.length;
        int firstIndexVal = 0;
        for (int i = 0; i < d; i++) {
            firstIndexVal = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j];
            }
            arr[n - 1] = firstIndexVal;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(ArrayRotation.rotateArray(arr, 4)));
    }

}
