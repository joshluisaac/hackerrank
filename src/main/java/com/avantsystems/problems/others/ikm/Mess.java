package com.avantsystems.problems.others.ikm;

@FunctionalInterface
public interface Mess {

    void test();
    default void func() {
        System.out.println();
    }

}
