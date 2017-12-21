package com.kodilla.good.patterns.food2door;

public class OrderAction1 implements OrderAction {

    int supplierNo = 1;

    public OrderAction1(final int supplierNo) {
        this.supplierNo = supplierNo;
    }

    @Override
    public void orderAction(Order order) {
        SupplierExtraFoodShop supplierExtraFoodShop = new SupplierExtraFoodShop
                (new OrderAvailableProduct(), new InfoMail(), new Repository1(),
                        new TransportShop(), new FinalConfirmationMail());
        supplierExtraFoodShop.process(order);
    }
}
