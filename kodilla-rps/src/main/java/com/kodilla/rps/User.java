package com.kodilla.rps;

public final class User {
    public final String userName;
    public final int winningRounds;

    public User(final String userName, final int winningRounds) {
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
