package com.kodilla.testing.totolotek;

import java.util.List;

public class MaszynaLosujaca {

   private Database database;

    public MaszynaLosujaca(Database database) {
        this.database = database;
    }

    public int miniLotto(List<Integer> daneUzytkownika){

       List<Integer> wynikiLosowania = database.wylosuj(5);
       int count =0;

       for (Integer listaA:daneUzytkownika)
       {
           if (wynikiLosowania.contains(listaA)){
               count++;
           }
       }

       return count;
   }

   public int jackpot (Integer... numbers) {
       int count2 = 0;
       int count3 = 0;

       int liczba = numbers.length;

       if (liczba==2) {

           List<Integer> wynikiLosowania2 = database.wylosuj(2);

           for (Integer integers : numbers) {
               {
                   if (wynikiLosowania2.contains(integers)) {
                       count2++;
                   }

               }
           } return count2;

       } else if (liczba==5) {
           List <Integer> wynikiLosowania3 = database.wylosuj(5);
           for (Integer integers2:numbers){
               {
                   if (wynikiLosowania3.contains(integers2)){
                       count3++;
                   }
               }
           }

           return count3;

       } else return 0;
   }


}
