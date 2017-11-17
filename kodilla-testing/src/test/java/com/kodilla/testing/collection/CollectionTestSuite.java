package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import java.lang.*;
import java.util.*;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin.");
    }
    @After
    public void after(){
        System.out.println("Test case: end.");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList()
    {
        //Given
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        OddNumbersExterminator test1 = new OddNumbersExterminator();

        //When
        ArrayList <Integer> test = (test1.exterminate(list1));

        /* Then */

        Assert.assertEquals(0,test.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList()
    {
        //Given
        ArrayList<Integer> numbersAll = new ArrayList<Integer>();
        numbersAll.add(1);
        numbersAll.add(2);
        numbersAll.add(3);
        numbersAll.add(4);
        numbersAll.add(5);

        ArrayList<Integer> numbersOdd = new ArrayList<Integer>();
        numbersOdd.add(2);
        numbersOdd.add(4);

        OddNumbersExterminator numb = new OddNumbersExterminator();


        //When
        ArrayList <Integer> test = (numb.exterminate(numbersAll));

        /* Then */
        Assert.assertEquals(numbersOdd,test);
    }
}
