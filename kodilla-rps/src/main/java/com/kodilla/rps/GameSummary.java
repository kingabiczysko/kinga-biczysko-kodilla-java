package com.kodilla.rps;

public class GameSummary {
    long userWinsSum;
    long computerWinsSum;

    public GameSummary(long userWinsSum, long computerWinsSum) {
        this.userWinsSum = userWinsSum;
        this.computerWinsSum = computerWinsSum;
    }

    public void gameSummary(){
        System.out.println("\n<<<<GAME FINISHED>>>>");
        System.out.println("Summary:");
        System.out.println("        User win: "+userWinsSum +".");
        System.out.println("        Computer win: " + computerWinsSum + ".");
        if(userWinsSum>computerWinsSum){
            System.out.println("<<<<USER wins!!!!>>>>");
        } else {
            System.out.println("<<<<COMPUTER wins!!!!>>>>");
        }
    }
}
