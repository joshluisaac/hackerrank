package com.avantsystems.problems.datastructures;

import java.awt.image.Kernel;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest {

    static void execute() {
        List<String> list = Arrays.asList("josh,zoe,asha,queda", "2", "zoe", "jay", "shane");
        Stream<String> stream = list.stream();
        Optional<String[]> result = stream.findFirst().map(x -> x.split(","));
        String[] x = result.orElse(null);
        System.out.println(x.toString());
    }

    static void stream2() {
        Stream.of("Josh", "Zoe", "Asha", "Maqueda", "Bodhi", "Natasha", "Samuel").map(s -> {
            System.out.println("Map: " + s);
            return s.toUpperCase();
        }).anyMatch(s -> {
            System.out.println(s);
            return s.startsWith("Z");
        });
    }

    public static void main(String[] args) {
        // StreamTest.execute();
        StreamTest.stream2();
    }

}
