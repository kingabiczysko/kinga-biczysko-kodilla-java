package com.kodilla.exception.test;

public class FirstChallenge {
    public void divide(int a, int b) {
        double result = a / b;
        System.out.println(result);
    }


    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {


        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            firstChallenge.divide(3, 0);

        } catch (ArithmeticException e) {
            System.out.println("Please check if your numbers are correct. \nPlease remember that you can not divide by 0!");

        } finally {
            System.out.println("\nThank you for using our program. See you next time!");
        }


    }
}