package com.kodilla.good.patterns.food2door;

public class OrderAction2 implements OrderAction{

    @Override
    public void orderAction(Order order) {
        SupplierHealthyShop supplierHealthyShop = new SupplierHealthyShop(new OrderAvailableProduct(),
                        new InfoMail(), new Repository1(), new TransportSupplier(), new FinalConfirmationMail());
                supplierHealthyShop.process(order);
    }
}
