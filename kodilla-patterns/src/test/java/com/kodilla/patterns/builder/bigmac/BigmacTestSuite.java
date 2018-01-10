package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacCheck(){
        //Given

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(3)
                .roll("with seeds")
                .sauce("standard")
                .ingredient("salad")
                .ingredient("cheese")
                .ingredient("cucumber")
                .build();
        System.out.println(bigmac);


        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce();
        String roll = bigmac.getRoll();


        //Then

        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals(3, howManyBurgers);
        Assert.assertEquals("with seeds",roll);
        Assert.assertEquals("standard", sauce);


    }
}
