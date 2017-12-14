package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewGame {

    private User user = new User();


    public static void newGame() {

        System.out.println("\nTill how many winner rounds we play? \nPlease write the number.");

        int winnerRound;
        Scanner keyboard = new Scanner(System.in);

        winnerRound = keyboard.nextInt();
        System.out.println("Thanks. So, we will play till one of us has got " + winnerRound + " rounds won.");

        String [] rounds = new String[winnerRound];
        List<String> userChoosed = new ArrayList<>();
        List<String> computerChoosed = new ArrayList<>();


        String key1 = "Stone";
        String key2 ="Paper";
        String key3 = "Scissors";
        String score;
        String computerWin="computer wins";
        String userWin= "user wins";
        String remis = "remis";

        for(int i=0;i<winnerRound;i++){
            int r = i+1;
            System.out.println("\nRound no "+r+". \nPlease choose the STONE (1), PAPER (2), SCISSORS (3):");
            int n =keyboard.nextInt();
            if(n==1){
                userChoosed.add(key1);
                System.out.println("You have chosen " + key1 + ".");

            } else if(n==2){
                userChoosed.add(key2);
                System.out.println("You have chosen " + key2 + ".");
            } else if(n==3){
                userChoosed.add(key3);
                System.out.println("You have chosen " + key3 + ".");
            } else {
                System.out.println("Wrong key.");
            }
            System.out.println("\nNow computer is choosing...");
            ComputerChoose computerChoose = new ComputerChoose();
            String computerChoose1 = computerChoose.setComputerChoose();
            computerChoosed.add(computerChoose1);
            System.out.println("Computer has chosen " + computerChoose1 +".");

            if(n==1 && computerChoose1==key2){
                score = computerWin;
            } else if(n==1 && computerChoose1 == key3) {
                score = userWin;
            } else if (n==2 && computerChoose1 == key1){
                score = userWin;
            } else if(n==2 && computerChoose1 == key3){
                score = computerWin;
            } else if(n==3 && computerChoose1 == key1){
                score = computerWin;
            } else if(n==3 && computerChoose1 == key2){
                score = userWin;
            } else {
                score = remis;
            }
            rounds[i] = score;

        }

        System.out.println("\nPlayer:");
        for(int i = 0; i<roundNumbers; i++) {
            System.out.println(userChoosed.get(i));
        }
        System.out.println("\nComputer:");
        for(int i = 0; i<roundNumbers; i++) {
            System.out.println(computerChoosed.get(i));
        }
        System.out.println("\nRounds table:");
        for(int i = 0; i<roundNumbers; i++) {
            System.out.println(rounds[i]);
        }



    }
}
