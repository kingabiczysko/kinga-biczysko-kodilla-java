package com.kodilla.rps;

import java.util.Random;

public class ComputerChoose {


    public int generatingComputerChoose() {

        Random randomGenerator = new Random();
        int computerChoose = randomGenerator.nextInt(3)+1;
        return computerChoose;
    }

}
