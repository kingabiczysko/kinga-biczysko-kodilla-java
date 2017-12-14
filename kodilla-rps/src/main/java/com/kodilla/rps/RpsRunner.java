package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {


    public static void main (String[] args){
        System.out.println("Game: Paper, Stone, Scissors. \nWelcome!!!");



        System.out.println("Please give me your name");

        String userName;
        int roundQuantity;

        Scanner keyboard = new Scanner(System.in);
        userName = keyboard.next();

        System.out.println("\nIt's nice to meet you " + userName +".");
        System.out.println("\nI will be your sparing partner in this game.");

        System.out.println("\nHow many rounds would you like to play? \nPlease write the number.");

        roundQuantity = keyboard.nextInt();

        System.out.println("Thanks. So, we will have "+roundQuantity+" rounds to play.");

        System.out.println("\nBefore we start, please find some rules:");
        System.out.println("Keyboard meanings:\nkey 1 - play 'stone'. " +
                "\nkey 2 - play 'paper'. \nkey 3 - play 'scissors'." +
                "\nkey x - finish the game. \nkey n - new game.");

        System.out.println("\nRound no 1.");
        System.out.println("\nPlease choose the key.");

        char key = keyboard.next().charAt(0);


        if (key =='x'){

            KeyX x=new KeyX();
            x.endGame();

        } else {
            System.out.println("cos jest nie halo :(");
        }



        User user = new User();

        user.setUser(userName);
        user.setRoundNumber(roundQuantity);






    }
}

