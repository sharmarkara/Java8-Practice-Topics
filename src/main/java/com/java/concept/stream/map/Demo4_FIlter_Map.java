package com.java.concept.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empid;
    String empname;
    int salary;

    public Employee(int empid, String empname, int salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }
}

public class Demo4_FIlter_Map {
    public static void main(String[] args) {
        /*List<Employee> employeesList=new ArrayList<Employee>();
        employeesList.add(new Employee(101,"Alex",10000));
        employeesList.add(new Employee(102,"Alex",10000));
        employeesList.add(new Employee(103,"Alex",10000));
        employeesList.add(new Employee(104,"Alex",10000));*/

        List<Employee> employeesList = Arrays.asList(new Employee(101, "Alex", 1000),
                new Employee(102, "Brain", 2000),
                new Employee(103, "Charles", 3000),
                new Employee(104, "David", 4000),
                new Employee(105, "Edward", 5000));
        //Combination of filter and map
        List<Integer> employeeSalList = employeesList.stream()
                .filter(e -> e.salary > 2000)
                .map(e -> e.salary)
                .collect(Collectors.toList());

        System.out.println(employeeSalList);
    }
}
