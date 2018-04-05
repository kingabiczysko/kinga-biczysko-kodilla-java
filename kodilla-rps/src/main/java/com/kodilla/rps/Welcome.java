package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Welcome {

    public int winningRounds;

    public boolean scanningRounds() {
        try {
            Scanner keyboard = new Scanner(System.in);
            winningRounds = keyboard.nextInt();
            return false;

        } catch (InputMismatchException exception){
            System.out.println("Wrong number, please try again.");
            return true;
        }
    }

    public int getWinningRounds() {
        return winningRounds;
    }
}
