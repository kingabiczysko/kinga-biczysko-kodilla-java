package com.kodilla.good.patterns.fly;

public class FlyApplication {



    public static void main(String[] args){



        System.out.println("Welcome in the PrivateFly Company.");
        System.out.println("Please choose what would you like to find:" +
                "\n1 - Flights from the Airport." +
                "\n2 - Flights to the Airports." +
                "\n3 - Flights with the plane change.");

        Action action = new Action();
        action.action();











    }
}


