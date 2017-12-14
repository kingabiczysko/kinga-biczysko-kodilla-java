package com.kodilla.rps;

import java.util.Scanner;

public class KeyX {



    public static void endGame(){
        System.out.println("Are you really sure you would like to finish the game?");
        System.out.println("Please use the key 'y' for YES and 'n' for NO.");

        Scanner keyboard = new Scanner(System.in);

        char endOfTheGame = keyboard.next().charAt(0);

        if (endOfTheGame=='y') {
            System.out.println("Thank you for good game today. Bye! See you next time!");
        }


    }
}
