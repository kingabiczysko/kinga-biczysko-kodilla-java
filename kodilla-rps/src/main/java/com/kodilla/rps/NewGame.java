package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewGame {

    int winnerRounds;

    public NewGame(int winnerRounds) {
        this.winnerRounds = winnerRounds;
    }

    public void newGame() {
        List<Integer> userChoosed = new ArrayList<>();
        List<Integer> computerChoosed = new ArrayList<>();
        List<Integer> userWins = new ArrayList<>();
        List<Integer> computerWins = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);


        for(int i=0;i<winnerRounds;i++){
            int r = i+1;
            System.out.println("\nRound no "+r+". \nPlease choose 1 (STONE), 2 (PAPER), 3 (SCISSORS):");
            int userChoose1 = keyboard.nextInt();
            if(userChoose1==1 || userChoose1==2 || userChoose1==3){
                userChoosed.add(userChoose1);
            } else {
                System.out.println("Wrong key.");
            }
            System.out.println("\nNow computer is choosing...");
            ComputerChoose computerChoose = new ComputerChoose();
            int computerChoose1 = computerChoose.generatingComputerChoose();
            computerChoosed.add(computerChoose1);

            System.out.println("You have chosen: " + userChoose1 + " and computer has chosen " + computerChoose1 +".");

            RoundResult roundResult1 = new RoundResult(userChoose1,computerChoose1);
            int roundResult = roundResult1.result();

            if(roundResult==0){
                userWins.add(0);
                computerWins.add(0);
            } else if(roundResult == 1){
                userWins.add(1);
                computerWins.add(0);
            } else {
                userWins.add(0);
                computerWins.add(1);
            }



        }


    }
}
