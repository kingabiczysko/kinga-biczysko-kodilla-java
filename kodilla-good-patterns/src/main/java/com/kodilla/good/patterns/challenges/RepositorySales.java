package com.kodilla.good.patterns.challenges;

public class RepositorySales implements Repository {
    @Override
    public void createSalesData (Order order) {
        System.out.println("Data created in the system for order no.: " + order.getOrderNo() +".");
    }
}
