package com.java.concept.stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Melisandre", "Sansa", "Jon", "Denerys", "Joffery");
        List<String> longnames = new ArrayList<String>();

        //longnames = names.stream().filter(str -> str.length() > 6 && str.length() < 8).collect(Collectors.toList());
        //System.out.println(longnames);

       // names.stream().filter(str -> str.length() > 6 && str.length() < 8).forEach(str-> System.out.print(str+" "));
        names.stream().filter(str -> str.length() > 6 && str.length() < 8).forEach(System.out::println);
    }
}
