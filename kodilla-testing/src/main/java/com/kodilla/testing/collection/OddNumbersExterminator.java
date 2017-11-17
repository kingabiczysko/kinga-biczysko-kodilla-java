package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {




  //  public OddNumbersExterminator(ArrayList<Integer> numbers)
  //  {
  //      this.numbers = numbers;
//
  //  }

    public ArrayList exterminate (ArrayList <Integer> numbers){

        ArrayList<Integer> numbersOdd = new ArrayList<Integer>();

        for (int i=0; i<numbers.size();i++)
        {
            if(numbers.get(i) % 2 == 0) {
               // numbers.remove();
                numbersOdd.add(numbers.get(i));
            }
        }

        return numbersOdd;
    }




}
