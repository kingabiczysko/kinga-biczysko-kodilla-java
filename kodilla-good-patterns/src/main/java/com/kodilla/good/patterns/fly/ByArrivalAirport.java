package com.kodilla.good.patterns.fly;

public class ByArrivalAirport {


    public void findConnectionToTheArrivalAirport(String airport, FlyTable flyTable) {

        System.out.println("\nThe connections to the Airport " + airport
                + ":");

        flyTable.getFlyTable().stream()
                .filter(n->n.getArrivalAirport().equals(airport))
                .forEach(System.out::println);






    }
}