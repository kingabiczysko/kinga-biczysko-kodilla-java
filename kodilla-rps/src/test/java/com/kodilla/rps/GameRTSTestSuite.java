package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GameRTSTestSuite {

    @Before
    public void beforeTest(){
        System.out.println("New test starting...");
    }

    @Test
    public void userCreationTest(){
        //Given

        User user1 = new User("Jas Fasola", 5);

        //When
        String username = user1.getUserName();
        int winningRounds = user1.getWinningRounds();

        //Then

        Assert.assertEquals(winningRounds,5);
        Assert.assertEquals(username,"Jas Fasola");

    }

    @Test
    public void roundResultTest(){
        //Given

        RoundResult roundResult1 = new RoundResult(4,5);
        RoundResult roundResult2 = new RoundResult(2,2);
        RoundResult roundResult3 = new RoundResult(5,4);

        //When
        int result1 = roundResult1.result();
        int result2 = roundResult2.result();
        int result3 = roundResult3.result();

        //Then
        Assert.assertEquals(result1,1);
        Assert.assertEquals(result2,0);
        Assert.assertEquals(result3,2);
    }

//     @Test
//    public void endGameTest(){
//        //Given
//        KeyX keyX = new KeyX();
//        //When
//
//        char endOfTheGame = 'y';
//
//        //Then
//        Assert.assertTrue(keyX.endGame());
//
//    }



    @Test
    public void gameSummaryTest(){
        //Given
        GameSummary gameSummary1 = new GameSummary(100,2);
        GameSummary gameSummary2 = new GameSummary(2,100);

        //When & Then

       String result1 = gameSummary1.gameSummary();
       String result2 = gameSummary2.gameSummary();

       //Then
        Assert.assertEquals(result1, "<<<<USER wins!!!!>>>>");
        Assert.assertEquals(result2,"<<<<COMPUTER wins!!!!>>>>");
    }

    @Test
    public void computerChooseTest(){

        //Given
        ComputerChoose computerChoose1 = new ComputerChoose();
        List<Integer> computerPossibleChoose = new ArrayList<>();
        computerPossibleChoose.add(1);
        computerPossibleChoose.add(2);
        computerPossibleChoose.add(3);
        computerPossibleChoose.add(4);
        computerPossibleChoose.add(5);
        computerPossibleChoose.add(6);

        //When
        int result = computerChoose1.generatingComputerChoose();
        //Then
        Assert.assertTrue(computerPossibleChoose.contains(result));



    }
}
