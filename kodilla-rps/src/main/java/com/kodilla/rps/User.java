package com.kodilla.rps;

public class User {
    String userName;
    int winningRounds;

    public User(String userName, int winningRounds) {
        this.userName = userName;
        this.winningRounds = winningRounds;
    }

    public String getUserName() {
        return userName;
    }

    public int getWinningRounds() {
        return winningRounds;
    }
}
