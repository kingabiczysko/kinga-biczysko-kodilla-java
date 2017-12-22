package com.kodilla.good.patterns.food2door;

public class ApplicationFood2Door {

    public OrderAction orderAction;


    public static void main (String[] args) {

        Product product = new Product("Carrot", 20);
        FinalUser customer = new FinalUser(1, "Jaś", "Fasola", "Szczecin");
        OrderRequest orderRequest = new OrderRequest();
        Order order = orderRequest.retrieve(product, 122, 1, 3, customer );
        OrderAction orderAction = new OrderAction();
        orderAction.orderAction(order.getSupplierNo(), order);



    }

}
