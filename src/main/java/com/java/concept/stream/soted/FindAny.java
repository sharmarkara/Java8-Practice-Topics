package com.java.concept.stream.soted;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {
    public static void main(String[] args) {

        // findAny()
        List<String> stringList = Arrays.asList("One","two","three","one");

//        Optional<String> ele=stringList.stream().findAny();
//        System.out.println(ele.get());

        // findFirst()
        Optional<String> ele=stringList.stream().findFirst();
        System.out.println(ele);
    }
}
