package com.kodilla.rps;

public final class RoundResult {
    private final int userChoose1;
    private final int computerChoose1;
    private int score;

    public RoundResult(final int userChoose1, final int computerChoose1) {
        this.userChoose1 = userChoose1;
        this.computerChoose1 = computerChoose1;
    }

    //1-stone
    //2-paper
    //3-scissors
    //4-lizard
    //5-Spock

    public final int result(){

        if(userChoose1==1 && computerChoose1==2){
           return score = 2;
        } else if(userChoose1==1 && computerChoose1 == 3) {
            return score = 1;
        } else if(userChoose1==1 && computerChoose1==4){
            return score = 1;
        } else if(userChoose1==1 && computerChoose1==5){
            return score=2;
        } else if (userChoose1==2 && computerChoose1 == 1){
           return score = 1;
        } else if(userChoose1==2 && computerChoose1 == 3){
           return score = 2;
        } else if(userChoose1==2 && computerChoose1 == 4){
            return score = 2;
        }else if(userChoose1==2 && computerChoose1 == 5){
            return score = 1;
        } else if(userChoose1==3 && computerChoose1 == 1){
            return score = 2;
        } else if(userChoose1==3 && computerChoose1 == 2){
            return score = 1;
        } else if(userChoose1==3 && computerChoose1 == 4){
            return score = 1;
        }else if(userChoose1==3 && computerChoose1 == 5){
            return score = 2;
        }else if(userChoose1==4 && computerChoose1 == 1){
            return score = 2;
        } else if(userChoose1==4 && computerChoose1 == 2){
            return score = 1;
        } else if(userChoose1==4 && computerChoose1 == 3){
            return score = 2;
        }else if(userChoose1==4 && computerChoose1 == 5){
            return score = 1;
        }else if(userChoose1==5 && computerChoose1 == 1){
            return score = 1;
        } else if(userChoose1==5 && computerChoose1 == 2){
            return score = 2;
        } else if(userChoose1==5 && computerChoose1 == 3){
            return score = 1;
        }else if(userChoose1==5 && computerChoose1 == 4){
            return score = 2;
        }
        else {
            return score = 0;
        }

    }
}

