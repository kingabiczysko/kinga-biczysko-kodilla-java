package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {


    public static void main (String[] args){


        System.out.println("Game: Paper, Stone, Scissors. \nWelcome!!!");
        System.out.println("Please give me your name");

        String userName;
        boolean end = false;


        Scanner keyboard = new Scanner(System.in);
        userName = keyboard.next();

        User user = new User();
        user.setUser(userName);

        System.out.println("\nIt's nice to meet you " + userName +".");
        System.out.println("\nI will be your sparing partner in this game.");
        System.out.println("\nBefore we start, please find some rules:");
        System.out.println("Keyboard meanings:\nkey 1 - play 'stone'. " +
                "\nkey 2 - play 'paper'. \nkey 3 - play 'scissors'." +
                "\nkey x - finish the game. \nkey n - new game.");

        while(!end) {
        System.out.println("\nPlease choose the key 'n' for new game or 'x' for finish.");

        char key = keyboard.next().charAt(0);



            if (key == 'n') {
                NewGame newGame = new NewGame();
                newGame.newGame();
            } else if (key == 'x') {

                KeyX x = new KeyX();
                end = x.endGame();

            } else {
                System.out.println("Wrong key. Please start again.");
            }
        }




    }
}

