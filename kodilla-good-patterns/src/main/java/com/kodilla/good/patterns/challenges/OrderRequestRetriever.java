package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public Order retrieve(){
        UserData user = new UserData("Jaś", "Fasola", 1234, "ul. Biala 3, Krakow");
        Product product = new Product("keyboard", 1222,100.55,5);
        int orderNo = 14555;
        int orderedQuantity = 1;


        return new Order(user, product, orderNo, orderedQuantity);
    }
}
