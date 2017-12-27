package com.kodilla.good.patterns.fly;

import java.util.ArrayList;
import java.util.List;

public final class FlyTable {

    private final List<Flight> flyTable = new ArrayList<>();


   public void creationTimeTable(){



       flyTable.add(new Flight("Szczecin", "Warszawa"));
       flyTable.add(new Flight("Szczecin","Kraków"));
       flyTable.add(new Flight("Kraków","Szczecin"));
       flyTable.add(new Flight("Kraków","Warszawa"));
       flyTable.add(new Flight("Warszawa","Szczecin"));
       flyTable.add(new Flight("Warszawa", "Kraków"));
       flyTable.add(new Flight("Szczecin", "Berlin"));
       flyTable.add(new Flight("Berlin", "Warszawa"));


   }

   public List<Flight> getFlyTable(){
       return new ArrayList<>(flyTable);
   }



}
