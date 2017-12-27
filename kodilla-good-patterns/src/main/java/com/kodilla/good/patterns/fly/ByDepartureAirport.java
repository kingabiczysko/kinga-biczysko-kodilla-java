package com.kodilla.good.patterns.fly;

public final class ByDepartureAirport {

    public void findConnectionFromTheDepartureAirport(String airport, FlyTable flyTable){
        System.out.println("\nThe connections from the Airport " + airport
                + ":");



        flyTable.getFlyTable().stream()
                .filter(f->f.getDepartureAirport().equals(airport))
                .forEach(System.out::println);

    }
}
