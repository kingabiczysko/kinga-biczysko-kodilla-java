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
        List<String> typesName = new ArrayList<>();
        typesName.add(0,"Null");
        typesName.add(1, "STONE");
        typesName.add(2, "PAPER");
        typesName.add(3,"SCISSORS");
        typesName.add(4,"LIZARD");
        typesName.add(5,"SPOCK");

        List<Integer> userChoosed = new ArrayList<>();
        List<Integer> computerChoosed = new ArrayList<>();
        List<Integer> userWins = new ArrayList<>();
        List<Integer> computerWins = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        long userWinsSum=0;
        long computerWinsSum=0;
        int r=1;

        while (userWinsSum<winnerRounds&&computerWinsSum<winnerRounds){
            System.out.println("\nRound no "+r+". \nPlease choose 1 (STONE), 2 (PAPER), 3 (SCISSORS)," +
                    " 4 (LIZARD), 5 (SPOCK):");

            int userChoose1 = keyboard.nextInt();
            if(userChoose1==1 || userChoose1==2 || userChoose1==3 || userChoose1==4 || userChoose1==5){
                userChoosed.add(userChoose1);
            } else {
                System.out.println("Wrong key.");
            }
            System.out.println("Now computer is choosing...");

            ComputerChoose computerChoose = new ComputerChoose();
            int computerChoose1 = computerChoose.generatingComputerChoose();
            computerChoosed.add(computerChoose1);
            System.out.println("You have chosen: " + typesName.get(userChoose1) + " and computer has chosen " + typesName.get(computerChoose1) +".");

            RoundResult roundResult1 = new RoundResult(userChoose1,computerChoose1);
            int roundResult = roundResult1.result();

            if(roundResult==0){
                userWins.add(0);
                computerWins.add(0);
                System.out.println("No winner.");
            } else if(roundResult == 1){
                userWins.add(1);
                computerWins.add(0);
                System.out.println("User wins.");
            } else {
                userWins.add(0);
                computerWins.add(1);
                System.out.println("Computer wins.");
            }

            userWinsSum = userWins.stream()
                    .filter(e->e!=0)
                    .count();
            computerWinsSum = computerWins.stream()
                    .filter(n->n!=0)
                    .count();
            System.out.println("Summary game result after round "+r+":");
            System.out.println("User win: "+userWinsSum +".");
            System.out.println("Computer win: " + computerWinsSum + ".");
            r++;
        }
        GameSummary gameSummary = new GameSummary(userWinsSum,computerWinsSum);
        gameSummary.gameSummary();
    }
}
