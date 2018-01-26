package com.kodilla.testing.additional;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static long getCountEmptyStringUsingJava7(List<String> strings) {

        long i=0;

        for(String pusty:strings){

            if(pusty.length()==0){
                i++;
            }
        }

        return i;

    }

    public static long getCountLength3UsingJava7(List<String> strings) {

        long k=0;
        for(String letters3:strings){
            if(letters3.length()==3){
                k++;
            }

        }
        return k;
    }

    public static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {

        List<String> expected = new ArrayList<>();

        for(String niepusty:strings){
            if(niepusty.length()!=0){
                expected.add(niepusty);
            }
        }
        return expected;


    }

    public static String getMergedStringUsingJava7(List<String> strings, String s) {
        String result = "";
        List<String> expected = new ArrayList<>();

        for(String niepusty:strings){
            if(niepusty.length()!=0){
                expected.add(niepusty);
            }
        }
        result = expected.get(0);

        for(int i=1;i<expected.size();i++){
            result = result +s + expected.get(i);
        }
        return result;
    }

    public static List<Integer> getSquares(List<Integer> numbers) {

        List<Integer> squares = new LinkedList<>();
        List<Integer> squaresFinal = new LinkedList<>();

        for(Integer squares1 : numbers) {
            Integer liczba = squares1;
            if (!squares.contains(liczba)) {
                squares.add(liczba);
            }
        }

        for(Integer squaresFin : squares){
            Integer squaresNumber = squaresFin*squaresFin;
            squaresFinal.add(squaresNumber);
        }
        return squaresFinal;
    }

    public static Integer getMax(List<Integer> numbers) {
        Integer maxNumber=0;

        for(Integer liczba:numbers){
            if(liczba>maxNumber){
                maxNumber=liczba;
            }
        }
        return maxNumber;
    }

    public static Integer getMin(List<Integer> numbers) {
        Integer minNumber = numbers.get(0);
        for(Integer liczba:numbers){
            if(liczba<minNumber){
                minNumber=liczba;
            }
        } return minNumber;
    }

    public static Integer getSum(List<Integer> numbers) {
        Integer sum=0;
        for(Integer liczba:numbers){
            sum=sum+liczba;
        } return sum;
    }

    public static Integer getAverage(List<Integer> numbers) {
        Integer average =0;
        Integer sum=0;
        Integer count=0;
        for(Integer liczba:numbers){
         sum = sum + liczba;
         count++;
        }
        average = sum/count;
        return average;
    }
}
