package com.kodilla.good.patterns.challenges;

public class UserData {

    String name;
    String surname;
    int customerNo;
    String address;

    public UserData(final String name, final String surname,
                final int customerNo, final String address) {
        this.name = name;
        this.surname = surname;
        this.customerNo = customerNo;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return " " + customerNo + ", " + name + " " + surname;
    }
}
