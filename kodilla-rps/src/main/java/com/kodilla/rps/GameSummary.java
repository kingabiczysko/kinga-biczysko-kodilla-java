package com.kodilla.rps;

public final class GameSummary {
    private final int userWins;
    private final int computerWins;

    public GameSummary(final int userWins, final int computerWins) {
        this.userWins = userWins;
        this.computerWins = computerWins;
    }

    public void gameSummary(){
        System.out.println("\n<<<<GAME FINISHED>>>>");
        System.out.println("Summary:");
        System.out.println("        User win: "+userWins +".");
        System.out.println("        Computer win: " + computerWins + ".");
        if(userWins>computerWins){
            System.out.println("<<<<USER wins!!!!>>>>");
        } else {
            System.out.println("<<<<COMPUTER wins!!!!>>>>");
        }
    }
}
