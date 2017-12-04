package com.kodilla.exception.test;

import java.util.HashMap;

public class FindFlight {

    public static void findFlight(Flight flight) throws RuntimeException {

        HashMap<String, Boolean> airportList = new HashMap<>();
        airportList.put("Berlin", true);
        airportList.put("London", true);
        airportList.put("Paris", true);
        airportList.put("Warszawa", false);
        airportList.put("Alicante", false);

        String departureAirport = flight.getDepartureAirport();
        Boolean checkDeparture = airportList.get(departureAirport);

        String arrivalAirport = flight.getArrivalAirport();
        Boolean checkArrival = airportList.get(arrivalAirport);

        if(checkDeparture == true && checkArrival == true){
            System.out.println("The flight from " + departureAirport + " into "+ arrivalAirport + " is available.");
        }
        else {
            System.out.println("The flight from " + departureAirport + " into "+ arrivalAirport + " is not available.");
        }



    }

    public static void main(String [] args){
        Flight flight1 = new Flight("Szczecin", "London");

        FindFlight findFlight = new FindFlight();

        try {
            findFlight.findFlight(flight1);
        } catch (RuntimeException e) {
            System.out.println("One of the airport is not available.");
        } finally {
            System.out.println("\nThank you for using our search machine.");
        }

    }
}
