package com.java.concept.stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctDemo {
    public static void main(String[] args) {
        List<String> vechilesList= Arrays.asList("bus","car","bus","car","car","bike");
        
//        List<String> distinctvechiles=vechilesList.stream().distinct().collect(Collectors.toList());
//        System.out.println(distinctvechiles);
        vechilesList.stream().distinct().forEach(value-> System.out.println(value));
        vechilesList.stream().distinct().forEach(System.out::println);

    }
}
