package com.kodilla.good.patterns.challenges;

public class SellServiceProduct implements SellService {
    @Override
    public boolean isAvailableToSell(Order order){

        System.out.println("Order no.: " + order.getOrderNo() +".");
        System.out.println("Requested quantity: "+order.getOrderedQuantity() +".");
        System.out.println("Available quantity: " + order.getProduct().getQuantityAvailable() + ".");



        if(order.getOrderedQuantity()<= order.getProduct().getQuantityAvailable()){
            System.out.println("Product available.");
            System.out.println("Value of order: " + order.valueOfOrder() + "PLN.\n");
            return true;
        } else {
            System.out.println("Product not available in requested quantity.");
            return false;
        }

    }
}
