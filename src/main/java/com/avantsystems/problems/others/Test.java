package com.avantsystems.problems.others;

public class Test {

    static String reverseAndCapitalise(String sentenceIn) {

        String[] cols = sentenceIn.split("\\s+");

        byte[] reversedStr = new byte[sentenceIn.getBytes().length];

        for (int p = 0; p < cols.length; p++){

            byte[] strToBytes = cols[p].getBytes();

            for (int i = 0; i < strToBytes.length; i++) {

                reversedStr[i] = strToBytes[strToBytes.length - i - 1];

            }

        }
        return new String(reversedStr);


    }



    public static String calculateTax(float income) {
        double tax = 0.0;
        System.out.println(income);

        if (income > 18200 && income < 37000) {
            tax = income * 0.19;
        }

        if (income > 37000 && income < 87000) {
            tax = income * 0.325;
        }

        if (income > Float.valueOf(87000) && income < Float.valueOf(180000)) {
            System.out.println("here");
            tax = income * 0.37;
        }


        if (income >= 180000) {
            System.out.println("here");
            tax = income * 0.45;
        }

        return String.valueOf(tax);

    }

    public static void main(String[] args) {
        String y = Test.reverseAndCapitalise("Hey there, Alan");
        System.out.println(y);

        System.out.println(Test.calculateTax(180001));
    }


}
