package com.java.concept.stream.soted;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Set<String> fruites=new HashSet<String>();
        fruites.add("One Apple");
        fruites.add("Mango");
        fruites.add("Two Apple");
        fruites.add("Two Guavas");
        fruites.add("One Guavas");

        // anyMatch()
        boolean result=fruites.stream().anyMatch(value-> {return value.startsWith("One");});
        System.out.println(result);

        // allMatch()
        boolean result1=fruites.stream().allMatch(value-> {return value.startsWith("One");});
        System.out.println(result1);

        // anyMatch()
        boolean result2=fruites.stream().noneMatch(value-> {return value.startsWith("One");});
        System.out.println(result2);
    }
}
