package com.kodilla.good.patterns.food2door;

public class OrderAvailableProduct implements OrderAvailable {
    @Override
    public boolean isAvailable(Order order) {
        System.out.println("Product is available.");
        return true;
    }
}
