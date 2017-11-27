package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;





public class World {


    public final Set<Continent> continentSet = new HashSet<>();

    public void addContinent(Continent continent){
        continentSet.add(continent);
    }

    public Set<Continent> getContinentSet() {
        return continentSet;
    }





    public BigDecimal getPeopleQuantity(){
        return continentSet.stream()
                .flatMap(country -> country.getCountrySet().stream())
                .map(Country::getPeopleQuantityForCountry)
                .reduce(BigDecimal.ONE,(sum, current)->sum.add(current));

    }
}
