package com.kodilla.good.patterns.food2door;

public class InfoPhone implements Info {
    @Override
    public void orderConfirmation(Order order) {
        System.out.println("Order no. " + order.getOrderNumber() + " was transferred to the supplier by the phone.");
    }
}
