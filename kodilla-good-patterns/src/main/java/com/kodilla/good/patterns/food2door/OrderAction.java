package com.kodilla.good.patterns.food2door;

public class OrderAction {



    public void orderAction (int supplierNo, Order order) {



        if(supplierNo ==1){
            SupplierExtraFoodShop supplierExtraFoodShop = new SupplierExtraFoodShop
                    (new OrderAvailableProduct(), new InfoMail(), new Repository1(),
                            new TransportShop(), new FinalConfirmationMail());
            supplierExtraFoodShop.process(order);
        } else {
            if (supplierNo == 2){
                SupplierHealthyShop supplierHealthyShop = new SupplierHealthyShop(new OrderAvailableProduct(),
                        new InfoMail(), new Repository1(), new TransportSupplier(), new FinalConfirmationMail());
                supplierHealthyShop.process(order);
            } else {
                if(supplierNo == 3){
                    SupplierGlutenFreeShop supplierGlutenFreeShop = new SupplierGlutenFreeShop
                            (new OrderAvailableProduct(), new InfoMail(), new Repository1(),
                                    new TransportSupplier(), new FinalConfirmationMail());
                    supplierGlutenFreeShop.process(order);
                }
            }
        }





    }
}
