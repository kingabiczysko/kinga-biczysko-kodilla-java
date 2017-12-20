package com.kodilla.good.patterns.food2door;

public class ApplicationFood2Door {

    public static void main (String[] args) {

        OrderRequest orderRequest = new OrderRequest();
        Order order = orderRequest.retrieve();


        if (order.getSupplierNo() == 1) {
            SupplierExtraFoodShop supplierExtraFoodShop = new SupplierExtraFoodShop
                    (new OrderAvailableProduct(), new InfoMail(), new Repository1(),
                            new TransportShop(), new FinalConfirmationMail());
            supplierExtraFoodShop.process(order);
        } else {
            if (order.getSupplierNo() == 2) {
                SupplierHealthyShop supplierHealthyShop = new SupplierHealthyShop(new OrderAvailableProduct(),
                        new InfoMail(), new Repository1(), new TransportSupplier(), new FinalConfirmationMail());
                supplierHealthyShop.process(order);
            } else {
                if (order.getSupplierNo() == 3) {
                    SupplierGlutenFreeShop supplierGlutenFreeShop = new SupplierGlutenFreeShop
                            (new OrderAvailableProduct(), new InfoMail(), new Repository1(),
                                    new TransportSupplier(), new FinalConfirmationMail());
                    supplierGlutenFreeShop.process(order);
                } else {
                    System.out.println("We do not offer purchase in that shop. Please choose the other one.");
                }
            }
        }
    }

}
