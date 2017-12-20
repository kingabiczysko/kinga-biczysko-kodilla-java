package com.kodilla.good.patterns.food2door;

class OrderRequest {

    public Order retrieve(){

        Product product = new Product("Carrot", 20);
        int orderNo = 122;
        int orderedQuantity = 2;
        int supplierNo = 1;
        FinalUser customer = new FinalUser(1, "Jaś", "Fasola", "Szczecin");



        return new com.kodilla.good.patterns.food2door.Order
                (orderNo, supplierNo, product,orderedQuantity, customer.getUserAddress());
    }

}