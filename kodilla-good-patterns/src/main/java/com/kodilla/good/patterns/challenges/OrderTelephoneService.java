package com.kodilla.good.patterns.challenges;

public class OrderTelephoneService implements InfoService {
    @Override
    public void infoService(Order order){
        System.out.println("The information about order was given by phone to customer. Order number: " +
               order.getOrderNo());
    }
}
