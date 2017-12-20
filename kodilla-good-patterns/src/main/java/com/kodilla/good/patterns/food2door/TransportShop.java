package com.kodilla.good.patterns.food2door;

public class TransportShop implements Transport {
    @Override
    public void transport(Order order) {
        System.out.println("\nTransport for order: " + order.orderNumber +
                " has been organized by Food2Door and will be delivered on address: " + order.deliveryAddress + ".\n");
    }
}
