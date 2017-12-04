package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling {

    public static void main (String args[]){

        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.probablyIWillThrowException(2,5);

        } catch (Exception1 e) {
            System.out.println("There is wrong number choose for the method!");
        }

        finally {
            System.out.println("System closed.");
        }

    }

}
