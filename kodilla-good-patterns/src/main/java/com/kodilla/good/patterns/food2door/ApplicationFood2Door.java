package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class ApplicationFood2Door {

    public OrderAction orderAction;


    public static void main (String[] args) {

        Product product = new Product("Carrot", 20);
        FinalUser customer = new FinalUser(1, "Jaś", "Fasola", "Szczecin");
        OrderRequest orderRequest = new OrderRequest();
        Order order = orderRequest.retrieve(product, 122, 1, 1, customer );



        Map<Integer,OrderAction> orderActionMap = new HashMap<>();
        orderActionMap.put(1,new OrderAction1(1));
        orderActionMap.put(2,new OrderAction2(2));
        orderActionMap.put(3,new OrderAction3(3));

        orderActionMap.get(order.getSupplierNo()).orderAction(order);



    }

}
