package com.kodilla.good.patterns.food2door;

public class SupplierGlutenFreeShop implements Supplier{

    public OrderAvailable orderAvailable;
    public Info info;
    public RepositoryGeneral repositoryGeneral;
    public Transport transport;
    public FinalConfirmation finalConfirmation;



    public SupplierGlutenFreeShop(final OrderAvailable orderAvailable, final Info info,
                                  final RepositoryGeneral repositoryGeneral, final Transport transport,
                                  final FinalConfirmation finalConfirmation) {
        this.orderAvailable = orderAvailable;
        this.info = info;
        this.repositoryGeneral = repositoryGeneral;
        this.transport = transport;
        this.finalConfirmation = finalConfirmation;
    }


    @Override
    public OrderDto process(Order order) {
        boolean isOrdered = orderAvailable.isAvailable(order);

        if(isOrdered){
            info.orderConfirmation(order);
            repositoryGeneral.createOrderRepository(order);
            transport.transport(order);
            System.out.println("contact with Customer");
            finalConfirmation.finalConfirmation(order);

            return new OrderDto(order.getOrderNumber(),true);
        } else {
            return new OrderDto( order.getOrderNumber(),false);
        }
    }


}
