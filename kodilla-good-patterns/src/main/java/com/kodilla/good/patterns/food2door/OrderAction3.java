package com.kodilla.good.patterns.food2door;

public class OrderAction3 implements OrderAction {

    int supplierNo = 3;

    public OrderAction3(final int supplierNo) {
        this.supplierNo = supplierNo;
    }

    @Override
    public void orderAction(Order order) {
        SupplierGlutenFreeShop supplierGlutenFreeShop = new SupplierGlutenFreeShop
                            (new OrderAvailableProduct(), new InfoMail(), new Repository1(),
                                    new TransportSupplier(), new FinalConfirmationMail());
                    supplierGlutenFreeShop.process(order);
    }
}
