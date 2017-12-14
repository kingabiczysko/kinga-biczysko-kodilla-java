package com.kodilla.good.patterns.challenges;

import java.util.*;

public class MovieStore {

    private final Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
    public String tytuly;


    public Map<String, List<String>> getMovies() {


        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");


        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

      //  tytuly = booksTitlesWithTranslations.stream()

        return booksTitlesWithTranslations;
    }


    public static void main (String[] args){
        System.out.println("what is going on here!\n");

        MovieStore movie = new MovieStore();

      //  movie.booksTitlesWithTranslations.toString();
        System.out.println(movie.booksTitlesWithTranslations.get("IM").toString());

    }


}
