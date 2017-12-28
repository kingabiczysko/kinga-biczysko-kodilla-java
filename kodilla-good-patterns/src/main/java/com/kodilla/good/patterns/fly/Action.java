package com.kodilla.good.patterns.fly;

import java.util.Scanner;

public final class Action {

    private int search;
    private String arrAirport;
    private String depAirport;

    public void action() {

        Scanner keyboard = new Scanner(System.in);
        search = keyboard.nextInt();
        FlyTable flyTable = new FlyTable();
        flyTable.creationTimeTable();

        if (search == 1) {
            ByDepartureAirport byDepartureAirport = new ByDepartureAirport();
            System.out.println("\nPlease choose the Departure Airport:\n");
            depAirport = keyboard.next();
            byDepartureAirport.findConnectionFromTheDepartureAirport(depAirport, flyTable);
        } else if (search == 2) {
                ByArrivalAirport byArrivalAirport = new ByArrivalAirport();
                System.out.println("\nPlease choose the Arrival Airport:\n");
                arrAirport = keyboard.next();
                byArrivalAirport.findConnectionToTheArrivalAirport(arrAirport, flyTable);

            } else if (search == 3) {
                    ByChangeAirport byChangeAirport = new ByChangeAirport();
                    System.out.println("Please choose the Departure Airport:\n");
                    depAirport = keyboard.next();
                    System.out.println("Please choose the Arrival Airport:\n");
                    arrAirport = keyboard.next();
                    byChangeAirport.findConnectionsByTheChangeAirport(depAirport,
                            arrAirport, flyTable);
                }


    }
}
