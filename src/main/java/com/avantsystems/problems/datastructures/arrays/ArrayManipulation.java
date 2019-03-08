package com.avantsystems.problems.datastructures.arrays;

import java.util.Arrays;

public class ArrayManipulation {

    static void execute(int n, int[][] queries){
        final int[] ARRAY = new int[n];
        for (int i = 0; i < queries.length; i++) {
            int startIndex = queries[i][0];
            int endIndex = queries[i][1];
            int summand = queries[i][2];
            recurse(ARRAY,startIndex,endIndex,summand);
        }
        int result = max(ARRAY);
        System.out.println(result);
    }

    public static int max(int[] arr){
        return Arrays.stream(arr).reduce((c1,c2) -> (c1 > c2) ? c1 : c2).orElse(-1);
    }


    static void recurse(int[] arr, int startIndex, int endIndex, int summand){
        for (int i = 0; i < arr.length; i++) {
            int index = i + 1;
            if (index >= startIndex && index <= endIndex) {
                arr[i] = arr[i] + summand;
            }
        }
    }

    public static void main(String[] args) {
        int [][] queries = {{1,2,100},{2,5,100},{3,4,100}};
        ArrayManipulation.execute(5,queries);
    }


}
