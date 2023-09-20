package com.java.concept.stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountDemo {
    public static void main(String[] args) {
        List<String> vechilesList = Arrays.asList("bus", "car", "bus", "car", "car", "bike");

        // count
       long count= vechilesList.stream().distinct().count();
        System.out.println(count);

        //limit()
       List<String> limitedVechilesList= vechilesList.stream().limit(2).collect(Collectors.toList());
        System.out.println("Limited values"+limitedVechilesList);
    }
}
