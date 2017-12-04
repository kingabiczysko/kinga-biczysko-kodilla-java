package com.kodilla.exception.test;

import java.util.HashMap;

public class FindFlight {

    public static void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> airportList = new HashMap<>();
        airportList.put("Berlin", true);
        airportList.put("London", true);
        airportList.put("Paris", true);
        airportList.put("Warszawa", false);
        airportList.put("Alicante", false);

        String departureAirport = flight.getDepartureAirport();
        String arrivalAirport = flight.getArrivalAirport();

        if(airportList.containsKey(departureAirport) && (airportList.containsKey(arrivalAirport))) {

                Boolean checkDeparture = airportList.get(departureAirport);
                Boolean checkArrival = airportList.get(arrivalAirport);

                if (checkDeparture && checkArrival) {
                    System.out.println("The flight from " + departureAirport + " into " + arrivalAirport + " is available.");
                } else {
                    System.out.println("The flight from " + departureAirport + " into " + arrivalAirport + " is not available.");
                }

            } else {
                throw new RouteNotFoundException("Airport name not available to choose.");
            }


        }


    public static void main(String [] args){
        Flight flight1 = new Flight("Szczecin", "London");

        FindFlight findFlight = new FindFlight();

        try {
            findFlight.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("One of the airport is not available to choose.");
        } finally {
            System.out.println("\nThank you for using our search machine.");
        }

    }
}
