package com.java.concept.stream.map;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
    public static void main(String[] args) {

        // Find length of each element from list
        List<String> vechiles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
       // lenghtOfStringElement(vechiles);
        lenghtOfStringElement(vechiles);
    }

    public static void lenghtOfStringElement(List<String> vehicles) {
        for (String name :
                vehicles) {
            System.out.print(name.length() + " ");
        }
    }
    public static void legthUsingStream(List<String> vehicles)
    {
        //vehicles.stream().map(vname->vname.length()).forEach(len-> System.out.println(len));

        vehicles.stream().map(vname->vname.length()).forEach(System.out::println);
    }
}