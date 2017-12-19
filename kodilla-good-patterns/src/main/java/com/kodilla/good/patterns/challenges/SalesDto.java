package com.kodilla.good.patterns.challenges;

public class SalesDto {

    public UserData user;
    public boolean isSold;

    public SalesDto(final UserData user, final boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public UserData getUser() {
        return user;
    }

    public boolean isSold (){
        return isSold;

    }
}
