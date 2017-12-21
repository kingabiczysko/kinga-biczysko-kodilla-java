package com.kodilla.good.patterns.fly;

import java.text.SimpleDateFormat;

public class Lot {

    String DepartureAirport;
    String ArrivalAirport;
    SimpleDateFormat departureTime = new SimpleDateFormat("hh:mm");

    public Lot(final String departureAirport,final String arrivalAirport, final SimpleDateFormat departureTime) {
        DepartureAirport = departureAirport;
        ArrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
    }

    public String getDepartureAirport() {
        return DepartureAirport;
    }

    public String getArrivalAirport() {
        return ArrivalAirport;
    }

    public SimpleDateFormat getDepartureTime() {
        return departureTime;
    }
}
