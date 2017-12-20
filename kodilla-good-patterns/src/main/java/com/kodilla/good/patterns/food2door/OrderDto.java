package com.kodilla.good.patterns.food2door;

public class OrderDto {

    public int orderNumber;
    public boolean isOrdered;

    public OrderDto( final int orderNumber, final boolean isOrdered) {
        this.orderNumber = orderNumber;
        this.isOrdered = isOrdered;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public boolean isOrdered () {
        return isOrdered;
    }
}
