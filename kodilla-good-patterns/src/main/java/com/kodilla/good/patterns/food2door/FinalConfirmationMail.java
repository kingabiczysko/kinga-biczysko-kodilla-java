package com.kodilla.good.patterns.food2door;

public class FinalConfirmationMail implements FinalConfirmation{

    @Override
    public void finalConfirmation(Order order) {
        System.out.println("The order no. " + order.orderNumber + " has been complieted.");
    }
}
