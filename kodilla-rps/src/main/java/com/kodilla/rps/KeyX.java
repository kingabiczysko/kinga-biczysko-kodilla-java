package com.kodilla.rps;

public final class KeyX {

    public static boolean endGame(KeyXAsker asker){

        char input = asker.ask("Are you really sure you would like to finish the game?\n" +
                "Please use the key 'y' for YES and 'n' for NO.");

//        Scanner keyboard = new Scanner(System.in);
//
//        char endOfTheGame = keyboard.next().charAt(0);

        if (input=='y') {
            input = asker.ask("Thank you for good game today. Bye! See you next time!");
            return true;
        }
            return false;
    }
}
