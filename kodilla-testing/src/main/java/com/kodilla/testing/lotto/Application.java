package com.kodilla.testing.lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Application {

    public static void main(String[] args){

        Set<Integer> liczbyUser = komputerWylosuj();



        int wynik=0;
        int losowanie=0;

        System.out.println(liczbyUser);
        System.out.println();
        Set<Integer> liczbyComp = null;

        while (wynik<6) {
            liczbyComp= komputerWylosuj();
            wynik = porownanie(liczbyUser,liczbyComp);
            losowanie++;
        }

        System.out.println(liczbyComp);
        System.out.println(losowanie);


    }

    public static Set<Integer> komputerWylosuj(){
        Random random = new Random();
        Set<Integer> komputerLiczby = new HashSet<>();

        while (komputerLiczby.size()<6){
            int i = random.nextInt(49)+1;
            komputerLiczby.add(i);
        }
        return komputerLiczby;
    }

    public static int porownanie(Set<Integer> user, Set<Integer> comp){

        int count =0;
        for (Integer liczba1:user){
            if(comp.contains(liczba1)){
                count++;
            }
        } return count;
    }
}
