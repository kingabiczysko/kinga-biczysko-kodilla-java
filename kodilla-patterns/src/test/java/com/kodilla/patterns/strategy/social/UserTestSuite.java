package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTestSuite {
   @Before
   public void beforeTest(){
       System.out.println("\nTest starting.\n");
   }


    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Jaś Fasola");
        User user2 = new YGeneration("Król Maciuś I");
        User user3 = new ZGeneration("Jola Lojalna");

        //When
        String user1Preferences = user1.sharePost();
        System.out.println("User 1: " + user1Preferences);

        String user2Preferences = user2.sharePost();
        System.out.println("User 2: " + user2Preferences);

        String user3Preferences = user3.sharePost();
        System.out.println("User 3: " + user3Preferences);


        //Then

        Assert.assertEquals("I do share post by Facebook",user1Preferences);
        Assert.assertEquals("I do share post by Snapchat", user2Preferences);
        Assert.assertEquals("I do share post by Twitter", user3Preferences);


    }


    @Test
    public void testIndividualSharingStrategy() {
        //Given

        User user1 = new Millenials("Jaś Fasola");


        //When
        String user1ShallUse = user1.sharePost();
        System.out.println("User 1 should say about himself: " + user1ShallUse);

        user1.setSocialPublisher(new TwitterPublisher());
        user1ShallUse = user1.sharePost();
        System.out.println("User 1 admitted: " + user1ShallUse );


        //Then
        Assert.assertEquals("I do share post by Twitter", user1ShallUse);
    }
}
