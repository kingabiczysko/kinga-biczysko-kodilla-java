package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;


public class Continent {


    public final Set<Country> countrySet = new HashSet<>();


    public void addCountry(Country country){
        countrySet.add(country);
    }



    public Set<Country> getCountrySet() {
        return countrySet;
    }
}



