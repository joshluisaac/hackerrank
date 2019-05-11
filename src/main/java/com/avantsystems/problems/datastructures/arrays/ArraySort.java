package com.avantsystems.problems.datastructures.arrays;

import java.util.Arrays;

public class ArraySort {

    static void swapUntilSortedState(int[] arr, int index){
        if (index == 0) return;

        if (arr[index] < arr[index-1]) {
            //hold currVal in a temp cache
            int currVal = arr[index];

            //swap current for previous
            arr[index] = arr[index-1];

            //swap previous for current
            arr[index-1] = currVal;

            System.out.println(Arrays.toString(arr));

            swapUntilSortedState(arr, index-1);
        }
    }



    static void sort(int[] arr){
        //start iterating from the second element in the list
        for (int i = 1; i < arr.length; i++) {
            int currVal = arr[i];
            int prevVal = arr[i-1];
            System.out.println("Iteration [" + i + "] ");
            //if the current item is greater than the previous then call swap method.
                if((currVal < prevVal)) swapUntilSortedState(arr,i);
        }

    }

    public static void main(String[] args) {
        //int[] arr = new int[]{1,2,3,4,5,6,0,9};
        int[] arr = new int[]{7, 1, 3, 2, 4, 5, 6};
        //System.out.println(Arrays.toString(arr));
        ArraySort.sort(arr);
        //System.out.println(Arrays.toString(arr));
        //ArraySort.iterateBackwards(arr,5);
    }
}
