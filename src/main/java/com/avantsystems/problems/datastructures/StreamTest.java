package com.avantsystems.problems.datastructures;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {


    static void execute(){
        List<String> list = Arrays.asList("josh,zoe,asha,queda","2","zoe","jay","shane");
        Stream<String> stream = list.stream();
        Optional<String[]> result = stream.findFirst().map(x -> x.split(","));
        String[] x = result.orElse(null);
        System.out.println(x.toString());
    }

    public static void main(String[] args) {
        StreamTest.execute();
    }

}
