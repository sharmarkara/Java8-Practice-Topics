package com.java.concept.stream.filter;

import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class FilterExample3 {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1, "HP", 25000.00));
        productList.add(new Product(2, "DELL", 30000.00));
        productList.add(new Product(3, "LENEVO", 24000.00));
        productList.add(new Product(4, "SONY", 35000.80));

        productList.stream()
                .filter(p -> p.price > 25000)//filtering
                .forEach(pr -> System.out.println(pr.price)); //Iterating
    }
}
