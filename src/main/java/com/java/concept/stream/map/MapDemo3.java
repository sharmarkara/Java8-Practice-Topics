package com.java.concept.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
    // Multiple 3 with each element from list
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(2, 3, 4, 5, 6);
        //listMultiply(numberList);
        listMulUsingMap(numberList);
    }

    public static void listMultiply(List<Integer> numberList) {
        List<Integer> resultList = new ArrayList<>();
        for (int element :
                numberList) {
            resultList.add(element * 3);
        }
        System.out.println(resultList);
    }

    public static void listMulUsingMap(List<Integer> numberList) {
        List<Integer> resultList = new ArrayList<>();
//        resultList=numberList.stream().map(num->num*3).collect(Collectors.toList());
//        System.out.println(resultList);
        //numberList.stream().map(num -> num * 3).forEach(num -> System.out.println(num));
        numberList.stream().map(num -> num * 3).forEach(System.out::println);
    }

}
