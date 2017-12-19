package com.kodilla.good.patterns.challenges;

public class Product {

    String productName;
    int productNo;
    double priceFor1;
    int quantityAvailable;

    public Product(String productName, int productNo, double priceFor1, int quantityAvailable) {
        this.productName = productName;
        this.productNo = productNo;
        this.priceFor1 = priceFor1;
        this.quantityAvailable = quantityAvailable;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductNo() {
        return productNo;
    }

    public double getPriceFor1() {
        return priceFor1;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }
}
