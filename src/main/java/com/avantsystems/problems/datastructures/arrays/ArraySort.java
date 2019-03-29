package com.avantsystems.problems.datastructures.arrays;

import java.util.Arrays;

public class ArraySort {


    static void swap(int[] arr, int index){
        int tmp = arr[index];
        arr[index] = arr[index-1];
        arr[index-1] = tmp;
        System.out.println("Swapped " + Arrays.toString(arr));
    }


    static void iterateBackwards(int[] arr, int index){
        int tmp = arr[index];
        for (int i = index-1; i > 0 ; i--) {
            System.out.println("[" + i + "] " + arr[i]);
            if(i >=0 && arr[i] < arr[i-1]) {
                swap(arr,i);
            }
        }
    }


    static void sort(int[] arr){
        int size = arr.length;
        for (int i = 1; i < size; i++) {

                if((arr[i] < arr[i-1])) {
                    swap(arr,i);
                    iterateBackwards(arr,i);
                }
        }

    }

    public static void main(String[] args) {

        //int[] arr = new int[]{1,2,3,4,5,6,0,9};
        int[] arr = new int[]{7, 1, 3, 2, 4, 5, 6};



        ArraySort.sort(arr);

        System.out.println(Arrays.toString(arr));

        //ArraySort.iterateBackwards(arr,5);

    }


}
