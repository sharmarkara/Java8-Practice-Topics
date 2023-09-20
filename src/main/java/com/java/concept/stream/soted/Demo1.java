package com.java.concept.stream.soted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(2,4,1,3,7,5,9);
        List<Integer> sortedlist=list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedlist);

        List<Integer> sortedlistRev=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedlistRev);

        // Strings
        List<String> list2=Arrays.asList("John","Mary","Kim","david","Smith");

       List<String> sortedList= list2.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> sortedList1= list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList1);
    }

}
