package com.kodilla.good.patterns.food2door;

public class Order {

    int orderNumber;
    int supplierNo;
    Product product;
    int quantityOrdered;
    String deliveryAddress;

    public Order(final int orderNumber, final int supplierNo, final Product product, final int quantityOrdered,
                 final String deliveryAddress) {
        this.orderNumber = orderNumber;
        this.supplierNo = supplierNo;
        this.product = product;
        this.quantityOrdered = quantityOrdered;
        this.deliveryAddress = deliveryAddress;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getSupplierNo() {
        return supplierNo;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}
