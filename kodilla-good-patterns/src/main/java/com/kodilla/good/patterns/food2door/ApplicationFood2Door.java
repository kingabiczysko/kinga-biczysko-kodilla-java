package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class ApplicationFood2Door {

    public static void main (String[] args) {

        OrderRequest orderRequest = new OrderRequest();
        Order order = orderRequest.retrieve();
        int supplierNo = order.getSupplierNo();

        Map<Integer,OrderAction> orderActionMap = new HashMap<>();
        orderActionMap.put(1,new OrderAction1());
        orderActionMap.put(2,new OrderAction2());
        orderActionMap.put(3,new OrderAction3());

        orderActionMap.get(supplierNo).orderAction(order);

    }

}
