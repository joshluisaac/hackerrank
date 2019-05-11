package com.avantsystems.problems.datastructures.arrays;

import java.util.Arrays;

public class ArrayReversal {

    /**
     * Less efficient as it internally uses a new array of
     * same size to cache the reversed items.
     * Also does traverses the entire array structure N times.
     *
     * @param arr the array to be reversed
     * @return
     */
    static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            result[(result.length - i) - 1] = arr[i];
        }
        return result;
    }


    /**
     * A more efficient technique for reversing an array.
     * Does an in-place swap without the need of creating a new array.
     * Uses swaps to reverse the items in place on N/2 passes/iteration.
     *
     * @param arr the array to be reversed.
     */
    static void reverseBySwaps(int[] arr){
        int size = arr.length;
        for (int i = 0; i < size/2; i++) {
            int tmp = arr[i];
            arr[i] = arr[(size - i) - 1];
            arr[(size - i) - 1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 300, 400, 500, 90, 160};
        int[] lessEfficient = reverseArray(a);
        System.out.println(Arrays.toString(lessEfficient));
        reverseBySwaps(a);
        System.out.println(Arrays.toString(a));
    }


}
