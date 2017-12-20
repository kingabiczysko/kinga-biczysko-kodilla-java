package com.kodilla.good.patterns.food2door;

public class FinalUser {
    int userNumber;
    String userName;
    String userSurname;
    String userAddress;

    public FinalUser(int userNumber, String userName, String userSurname, String userAddress) {
        this.userNumber = userNumber;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userAddress = userAddress;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserAddress() {
        return userAddress;
    }
}
