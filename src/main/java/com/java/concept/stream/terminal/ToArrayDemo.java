package com.java.concept.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class ToArrayDemo {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");
        Object array[] = stringList.stream().toArray();
        for (Object ele:
             array) {
            System.out.println(ele);
        }
    }
}
