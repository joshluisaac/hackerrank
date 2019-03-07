package com.avantsystems.problems.arrays;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayManipulationSolution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        final int[] ARRAY = new int[n];
        for (int i = 0; i < queries.length; i++) {
            int startIndex = queries[i][0];
            int endIndex = queries[i][1];
            int summand = queries[i][2];
            recurse(ARRAY,startIndex,endIndex,summand);
        }
        return getMax(ARRAY);
    }

    public static int getMax(int[] ARRAY){
        int minVal = Integer.MIN_VALUE;
        for (int i = 0; i < ARRAY.length; i++) {
            if (ARRAY[i] > minVal) {
                minVal = ARRAY[i];
            }
        }
        return minVal;
    }

    static void recurse(int[] ARRAY, int startIndex, int endIndex, int summand){
        for (int i = 0; i < ARRAY.length; i++) {
            int index = i + 1;
            if (index >= startIndex && index <= endIndex) {
                ARRAY[i] = ARRAY[i] + summand;
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
