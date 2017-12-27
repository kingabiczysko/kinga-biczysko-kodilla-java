package com.kodilla.good.patterns.fly;

import java.util.List;
import java.util.stream.Collectors;

public final class ByChangeAirport {

    public void findConnectionsByTheChangeAirport(String departureAirport, String arrivalAirport,
                                                  FlyTable flyTable) {

        System.out.println("\nThe connections from Airport: " + departureAirport + " to the Airport: " +
                arrivalAirport + " with the change on the way:");


        List<String> change = flyTable.getFlyTable().stream()
                .filter(e -> e.getDepartureAirport().equals(departureAirport))
                .filter(a -> !a.getArrivalAirport().equals(arrivalAirport))
                //   .map(Flight::toString)
                .collect(Collectors.toList()).stream()
                .map(a -> a.getArrivalAirport())
                .collect(Collectors.toList());



        for (int i = 0; i < change.size(); i++) {
            int k=i;

            System.out.println(change.get(k));
            flyTable.getFlyTable().stream()
                    .filter(d->d.getDepartureAirport().equals(departureAirport))
                    .filter(a->a.getArrivalAirport().equals(change.get(k)))
                    .forEach(System.out::println);

            flyTable.getFlyTable().stream()
                    .filter(e -> e.getDepartureAirport().equals(change.get(k)))
                    .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                    .forEach(System.out::println);
             }
    }
}










