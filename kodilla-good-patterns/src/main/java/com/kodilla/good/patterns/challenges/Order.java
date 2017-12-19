package com.kodilla.good.patterns.challenges;

public class Order {

    private UserData user;
    private Product product;
    private int orderNo;
    private int orderedQuantity;


    public Order(UserData user, Product product, int orderNo, int orderedQuantity) {
        this.user = user;
        this.product = product;
        this.orderNo = orderNo;
        this.orderedQuantity = orderedQuantity;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public int getOrderedQuantity() {
        return orderedQuantity;
    }

    public double valueOfOrder(){
        return product.priceFor1 * orderedQuantity;
    }

    public UserData getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

}
