package com.kodilla.good.patterns.challenges;

public class OrderMailService implements InfoService {
    @Override
    public void infoService (Order order){
        System.out.println("The information about order " + order.getOrderNo() +
                " was sent by e-mal to customer" + order.getUser().toString() + ".");
    }
}
