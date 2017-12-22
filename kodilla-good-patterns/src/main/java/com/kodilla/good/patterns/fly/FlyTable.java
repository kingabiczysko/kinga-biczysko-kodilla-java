package com.kodilla.good.patterns.fly;

import java.util.HashMap;

public class FlyTable {


   String departure1 = "Szczecin";
   String departure2 = "Kraków";
   String departure3 = "Warszawa";



   public HashMap<String, Lot> creationTimeTable(){

       HashMap<String,Lot> flyTable = new HashMap<>();

       flyTable.put(departure1,new Lot (departure1, departure3, "8:30"));
       flyTable.put(departure1, new Lot(departure1, departure2, "12:00"));
       flyTable.put(departure2,new Lot(departure2, departure3, "08:00"));
       flyTable.put(departure2, new Lot(departure2, departure3, "16:00"));

       return flyTable;

   }



}
