package com.kodilla.good.patterns.food2door;

public class Repository1 implements RepositoryGeneral {
    @Override
    public void createOrderRepository(Order order) {
        System.out.println("Data created in the system for order no.: " + order.getOrderNumber() + ".");
    }
}
