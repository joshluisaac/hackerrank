package com.avantsystems.problems.others.ikm;


import java.util.stream.Stream;

class Parent {
    protected static int count = 0;
    public Parent(){
        count++;
    }

    static int getCount(){
        return count;
    }

}

public class MyCollection extends Parent{
public MyCollection(){count++;}

void meth(){}

    public static void main(String[] args) throws Exception {
Stream.of("josh").filter(s -> !s.startsWith("p"));




    }

}
