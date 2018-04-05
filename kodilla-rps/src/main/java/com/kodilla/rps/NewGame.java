package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class NewGame{

    private final int winnerRounds;
    private int userChoose1;

    public NewGame(final int winnerRounds) {
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
        int userWins = 0;
        int computerWins = 0;
        Scanner keyboard = new Scanner(System.in);
        int r=1;

        while (userWins<winnerRounds&&computerWins<winnerRounds){

            System.out.println("\nRound no "+r+". \nPlease choose 1 (STONE), 2 (PAPER), 3 (SCISSORS)," +
                    " 4 (LIZARD), 5 (SPOCK):");
            if(keyboard.hasNextInt()) {
                userChoose1 = keyboard.nextInt();
            }
            else{
                String error = keyboard.next();
                System.out.println(error + " is the wrong key.");
            }
                if(userChoose1>0 && userChoose1<6){
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
                System.out.println("No winner.");
            } else if(roundResult == 1){
                userWins++;
                System.out.println("User wins.");
            } else {
                computerWins++;
                System.out.println("Computer wins.");
            }
            System.out.println("Summary game result after round "+r+":");
            System.out.println("User win: "+userWins +".");
            System.out.println("Computer win: " + computerWins + ".");
            r++;
        }
        GameSummary gameSummary = new GameSummary(userWins,computerWins);
        gameSummary.gameSummary();
    }
}
