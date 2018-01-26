package com.kodilla.rps;

import java.util.Random;

public final class ComputerChoose {


    public int generatingComputerChoose() {

        Random randomGenerator = new Random();
        int computerChoose = randomGenerator.nextInt(5)+1;
        return computerChoose;
    }

}
