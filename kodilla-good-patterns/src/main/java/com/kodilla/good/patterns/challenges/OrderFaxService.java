package com.kodilla.good.patterns.challenges;

public class OrderFaxService implements InfoService {
    @Override
    public void infoService(Order order) {
        System.out.println("The information about order was sent by FAX to customer. Order number: " +
                order.getOrderNo());
    }
}
