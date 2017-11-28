package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void getPeopleQuantity(){
        // Given

        Country polska = new Country(new BigDecimal("38000000"));
        Country niemcy = new Country(new BigDecimal("81000000"));
        Country francja = new Country(new BigDecimal("67000000"));
        Country usa = new Country(new BigDecimal("327000000"));
        Country meksyk = new Country(new BigDecimal("125000000"));
        Country rosja = new Country(new BigDecimal("142000000"));
        Country chiny = new Country(new BigDecimal("1379000000"));

        Continent europa = new Continent();
        europa.addCountry(polska);
        europa.addCountry(niemcy);
        europa.addCountry(francja);



        Continent ameryka = new Continent();
        ameryka.addCountry(usa);
        ameryka.addCountry(meksyk);

        Continent azja = new Continent();
        azja.addCountry(rosja);
        azja.addCountry(chiny);

        World world = new World();
        world.addContinent(europa);
        world.addContinent(ameryka);
        world.addContinent(azja);



        // When

        BigDecimal calculatedValue = world.getPeopleQuantity();


        // Then
        Assert.assertEquals(calculatedValue, new BigDecimal("2159000000"));

    }
}
