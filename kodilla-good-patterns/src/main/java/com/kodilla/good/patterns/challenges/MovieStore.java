package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStore {

    private static final Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
    private static final List<String> ironManTranslations = new ArrayList<>();
    private static final List<String> avengersTranslations = new ArrayList<>();
    private static final List<String> flashTranslations = new ArrayList<>();

    public static List<String> getIronManTranslations() {
        return ironManTranslations;
    }

    public static List<String> getAvengersTranslations() {
        return avengersTranslations;
    }

    public static List<String> getFlashTranslations() {
        return flashTranslations;
    }

    public void getMovies() {

        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);


    }

    public static void main(String [] args){
        MovieStore movieStore=new MovieStore();
        movieStore.getMovies();

        String titles = booksTitlesWithTranslations.entrySet().stream()
                .flatMap(p -> p.getValue().stream())
                .collect(Collectors.joining("!","",""));


        System.out.println(titles);

    }
}

