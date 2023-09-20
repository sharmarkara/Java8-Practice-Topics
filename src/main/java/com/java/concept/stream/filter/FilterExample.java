package com.java.concept.stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
       /* ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(15);
        numbersList.add(20);
        numbersList.add(25);
        numbersList.add(30);*/
        // List<Integer> numberList = Arrays.asList(10, 15, 20, 25, 30);
        evenNumberWithoutStream();
        evenNumberWithStream();
    }

    public static void evenNumberWithoutStream() {
        List<Integer> numberList = Arrays.asList(10, 15, 20, 25, 30);
        ArrayList<Integer> evenNumbersList = new ArrayList<>();
        // Find even number without stream
        for (int n : numberList) {
            if (n % 2 == 0)
                evenNumbersList.add(n);
        }
        System.out.println(evenNumbersList);
    }

    public static void evenNumberWithStream()
    {
        List<Integer> numbersList = Arrays.asList(10, 15, 20, 25, 30);
        List<Integer> evenNumbersList = new ArrayList<>();

        evenNumbersList= numbersList.stream().filter(n->n %2==0).collect(Collectors.toList());
        System.out.println(evenNumbersList);

        //Without storing we can print it
       // numbersList.stream().filter(n->n%2 ==0).forEach(n-> System.out.println(n));
        // forEach() method take consumer function as a input
        numbersList.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
