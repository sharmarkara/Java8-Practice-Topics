package com.java.concept.stream.soted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExam {
    public static void main(String[] args) {

        final List<Integer> list= Arrays.asList(5, 1, 3, 4, 2);
        System.out.println("Ascending Order");
        list.stream().sorted().forEach(System.out::println);

        System.out.println("\nDescending Order");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
