package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {



    public static void main (String[] args){
        String userName;
        boolean end = false;
        int winningRounds;


        System.out.println("Game: Paper, Stone, Scissors. \nWelcome!!!");
        System.out.println("Please give me your name");
        Scanner keyboard = new Scanner(System.in);
        userName = keyboard.next();
        System.out.println("\nTill how many winning rounds we play?");
        winningRounds = keyboard.nextInt();

        User user = new User(userName,winningRounds);

        System.out.println("\nIt's nice to meet you " + user.getUserName() +".");
        System.out.println("\nI will be your sparing partner in this game.");
        System.out.println("So, " + user.getUserName() +" we will play till " + user.getWinningRounds() + " winning rounds.");

        GameInfo.gameinfo();

        while(!end) {
        System.out.println("\nPlease choose the key 'n' for new game or 'x' for finish.");
        char key = keyboard.next().charAt(0);
            if (key == 'n') {
                NewGame newGame = new NewGame(user.winningRounds);
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

