package com.kodilla.exception.test;

public class FirstChallenge {
    public void divide(int a, int b) {

        try {

            double result = a / b;
            System.out.println(result);


        } catch (ArithmeticException e) {
            System.out.println("Please check if your numbers are correct. Please remember that you can not divide by 0!");

        } finally {
            System.out.println("\nThank you for using our program. See you next time!");
        }
    }


    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {


        FirstChallenge firstChallenge = new FirstChallenge();

        firstChallenge.divide(3, 0);


    }
}