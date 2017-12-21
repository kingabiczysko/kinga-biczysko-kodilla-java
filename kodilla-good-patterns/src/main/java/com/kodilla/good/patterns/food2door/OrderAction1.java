package com.kodilla.good.patterns.food2door;

public class OrderAction1 implements OrderAction {


    @Override
    public void orderAction(Order order) {
        SupplierExtraFoodShop supplierExtraFoodShop = new SupplierExtraFoodShop
                (new OrderAvailableProduct(), new InfoMail(), new Repository1(),
                        new TransportShop(), new FinalConfirmationMail());
        supplierExtraFoodShop.process(order);
    }
}
