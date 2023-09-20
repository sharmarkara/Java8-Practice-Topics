package com.java.concept.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {

        // Goal is to convert every elemnts of collecyion to upper case.
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        //listUpperCase(vehicles);
        listUpperusingMap(vehicles);
    }
    // Without using stream concept
    public static void listUpperCase(List<String> vehicles) {
        // 1. Before java8 without using stream
        List<String> vehiclesListUpperCase = new ArrayList<String>();

        for (String name :
                vehicles) {
            vehiclesListUpperCase.add(name.toUpperCase());
        }
        System.out.println(vehiclesListUpperCase);
    }

    public static void listUpperusingMap(List<String> vehicles)
    {
        List<String> vehiclesListUpperCase = new ArrayList<String>();
        vehiclesListUpperCase=vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(vehiclesListUpperCase);
    }

}
