package com.kodilla.good.patterns.food2door;

public class TransportSupplier implements Transport {
    @Override
    public void transport(Order order) {
        System.out.println("\nTransport for order no: " + order.orderNumber +
                " has been organized by Supplier on address " +
                order.deliveryAddress + ".\n");
    }
}
