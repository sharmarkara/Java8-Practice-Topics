package com.java.concept.stream.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Scott", "David", "John");
        List<String> teamB = Arrays.asList("Mary", "Luna", "Tom");
        List<String> teamC = Arrays.asList("Ken", "Jony", "Kitty");

        List<List<String>> playersInWorlsCup = new ArrayList<>();
        playersInWorlsCup.add(teamA);
        playersInWorlsCup.add(teamB);
        playersInWorlsCup.add(teamC);

        // Before java 8
//        for (List<String> team :
//                playersInWorlsCup) {
//            for (String name :
//                    team) {
//                System.out.println(name);
//            }
//        }

        // Using streams flatmap()
       List<String> finalresults= playersInWorlsCup.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
        System.out.println(finalresults);
    }
}
