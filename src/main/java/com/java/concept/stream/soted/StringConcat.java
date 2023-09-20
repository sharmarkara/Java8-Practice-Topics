package com.java.concept.stream.soted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringConcat {
    public static void main(String[] args) {
        List<String> animals= Arrays.asList("Dog","Cat","Elephant");
        List<String> birdList= Arrays.asList("Peacock","Parrot","Owl");

        Stream<String> stream1 = animals.stream();
        Stream<String> stream2 = birdList.stream();

        List<String> finalList=Stream.concat(stream1,stream2).collect(Collectors.toList());

        for (String item:
             finalList) {
            System.out.println(item);
        }


    }
}

