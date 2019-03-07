package com.avantsystems.problems;

public class ArrayManipulation {

    //public  static final int[] ARRAY = new int[10];


    static void execute(int n, int[][] queries){
        final int[] ARRAY = new int[n];
        for (int i = 0; i < queries.length; i++) {
            int startIndex = queries[i][0];
            int endIndex = queries[i][1];
            int summand = queries[i][2];
            recurse(ARRAY,startIndex,endIndex,summand);
        }
        int result = getMax(ARRAY);
        System.out.println(result);
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

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(ArrayManipulation.ARRAY));
        int [][] queries = {{1,2,100},{2,5,100},{3,4,100}};
        ArrayManipulation.execute(5,queries);



    }


}
