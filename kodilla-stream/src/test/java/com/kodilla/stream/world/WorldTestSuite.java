package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void getPeopleQuantity(){
        // Given

        Country polska = new Country(new BigDecimal("38 000 000"));
        Country niemcy = new Country(new BigDecimal("81 000 000"));
        Country francja = new Country(new BigDecimal("67 000 000"));
        Country usa = new Country(new BigDecimal("327 000 000"));
        Country meksyk = new Country(new BigDecimal("125 000 000"));
        Country rosja = new Country(new BigDecimal("142 000 000"));
        Country chiny = new Country(new BigDecimal("1 379 000 000"));

        Continent europa = new Continent();
        Set<Country> europaSet = new HashSet<>();
            europaSet.add(polska);
            europaSet.add(niemcy);
            europaSet.add(francja);


        Continent ameryka = new Continent();
        Set<Country> amerykaSet = new HashSet<>();
        amerykaSet.add(usa);
        amerykaSet.add(meksyk);

        Continent azja = new Continent();
        Set<Country>azjaSet = new HashSet<>();
        azjaSet.add(rosja);
        azjaSet.add(chiny);

        World world = new World();
        Set<Continent>worldSet = new HashSet<>();
        worldSet.add(europa);
        worldSet.add(ameryka);
        worldSet.add(azja);



        // When

        BigDecimal calculatedValue = world.getPeopleQuantity();


        // Then
        Assert.assertEquals(calculatedValue, new BigDecimal("2 159 000 000"));

    }
}
