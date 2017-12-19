package com.kodilla.good.patterns.challenges;

public class MainApplication {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        Order order = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService
                (new SellServiceProduct(), new RepositorySales(),
                new OrderMailService());
        productOrderService.process(order);

    }
}
