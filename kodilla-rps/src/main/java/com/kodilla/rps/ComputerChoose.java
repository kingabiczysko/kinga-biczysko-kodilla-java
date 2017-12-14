package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerChoose {

    List<String> mainList = new ArrayList<>();

    public String setComputerChoose() {

        mainList.add("Stone");
        mainList.add("Paper");
        mainList.add("Scissors");


        Random randomGenerator = new Random();
        int computerChoose = randomGenerator.nextInt(3);

        return mainList.get(computerChoose);
    }

}
