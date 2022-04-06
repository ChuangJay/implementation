package com.demo0.stream.terminal.model;

public class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}