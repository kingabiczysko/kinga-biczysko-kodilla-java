package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {


    @BeforeClass
    public static void createLog(){
        System.out.println("test log open.");
        Logger.getInstance().log("test logow 1");
        Logger.getInstance().log("test logow 2");
        Logger.getInstance().log("test logow 3");
    }

    @AfterClass
    public static void closeLog(){
        System.out.println("Test log closed.");
    }

    @Test
    public void testGetLastLog(){
        //Given
        //When

        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("test logow 3",result);
    }


}
