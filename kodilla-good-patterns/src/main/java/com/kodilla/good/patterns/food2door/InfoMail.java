package com.kodilla.good.patterns.food2door;

public class InfoMail implements Info {
    @Override
    public void orderConfirmation(Order order) {
        System.out.println("Order no. " + order.orderNumber +
                " was sent to the supplier.");
    }
}
