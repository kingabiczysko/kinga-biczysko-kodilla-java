package com.kodilla.good.patterns.food2door;

public class Product {
    String productName;
    int productQuantityAvailable;


    public Product(String productName, int productQuantityAvailable) {
        this.productName = productName;
        this.productQuantityAvailable = productQuantityAvailable;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantityAvailable() {
        return productQuantityAvailable;
    }
}
