package com.java.concept.stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");

        Optional<String> reduced=stringList.stream().reduce((value, combinedvalue)->{
            return combinedvalue+value;
        });
        System.out.println(reduced.get());
    }
}
