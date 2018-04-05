package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main (String[] args){

        boolean end = false;
        Scanner keyboard = new Scanner(System.in);
        String userName;
        int winningRounds;
        char key;

        System.out.println("Game: Paper, Stone, Scissors. \nWelcome!!!");
        System.out.println("Please give me your name");
        userName = keyboard.next();
        User user = new User(userName);
        System.out.println("\nIt's nice to meet you " + user.getUserName() + ".");
        System.out.println("\nI will be your sparing partner in this game.");
        GameInfo.gameinfo();
        while(!end) {
        System.out.println("\nPlease choose the key 'n' for new game or 'x' for finish.");
        key = keyboard.next().charAt(0);
        if (key == 'n') {
            System.out.println("\n" + user.userName + " till how many winning rounds we play?");
            if (keyboard.hasNextInt()){
            winningRounds = keyboard.nextInt();
            System.out.println("So, " + user.getUserName() + " we will play till " + winningRounds + " winning rounds.");
            NewGame newGame = new NewGame(winningRounds);
            newGame.newGame();} else {
                String key2 = keyboard.next();
                System.out.println(key2 + " is the wrong key!");
            }
        } else if (key == 'x') {
            KeyX x = new KeyX();
            end = x.endGame(new KeyXAsker(System.in, System.out));
        } else {
            System.out.println("Wrong key. Let's start again.");
        }
        }
    }

}

