package com.kodilla.good.patterns.food2door;

class OrderRequest {



    public Order retrieve (Product product, int orderNo, int orderedQuantity, int supplierNo, FinalUser customer){

        return new com.kodilla.good.patterns.food2door.Order
                (orderNo, supplierNo, product,orderedQuantity, customer.getUserAddress());
    }

}