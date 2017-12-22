package com.kodilla.good.patterns.fly;

import java.util.Objects;

public class Lot {

    String departureAirport;
    String arrivalAirport;
    String departureTime;

    public Lot(final String departureAirport,final String arrivalAirport, final String departureTime ) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lot lot = (Lot) o;
        return Objects.equals(departureAirport, lot.departureAirport) &&
                Objects.equals(arrivalAirport, lot.arrivalAirport) &&
                Objects.equals(departureTime, lot.departureTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(departureAirport);
    }
}
