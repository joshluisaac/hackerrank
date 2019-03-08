package com.avantsystems.problems.datastructures.arrays;

import java.util.Arrays;

public class ArrayReversal {

    static int[] reverseArray(int[] a) {
        int[] result = new int[a.length];
        for (int i = a.length - 1; i < a.length && i >= 0; i--) {
            result[(result.length - i) - 1] = a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 300, 400};
        int x[] = reverseArray(a);
        System.out.println(Arrays.toString(x));
    }


}
