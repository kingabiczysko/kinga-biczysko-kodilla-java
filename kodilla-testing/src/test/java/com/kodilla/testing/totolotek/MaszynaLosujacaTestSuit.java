package com.kodilla.testing.totolotek;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MaszynaLosujacaTestSuit {

    @Test
    public void maszynaLosujacaTest(){
        //Given

        Database databaseMock = mock(Database.class);
        List<Integer> listaBazaDanych = new ArrayList<>();
        listaBazaDanych.add(2);
        listaBazaDanych.add(6);
        listaBazaDanych.add(17);
        listaBazaDanych.add(1);
        listaBazaDanych.add(9);

        when(databaseMock.wylosuj(5)).thenReturn(listaBazaDanych);

        MaszynaLosujaca maszynaLosujaca= new MaszynaLosujaca(databaseMock);

        List<Integer> listaUzytkownika = new ArrayList<>();
        listaUzytkownika.add(5);
        listaUzytkownika.add(7);
        listaUzytkownika.add(2);
        listaUzytkownika.add(8);
        listaUzytkownika.add(18);


        //When

        int result = maszynaLosujaca.miniLotto(listaUzytkownika);

        //Then

        Assert.assertEquals(1, result);



    }
    @Test
    public void maszynaLosujaca2Test(){

        //Given

        Database database2Mock = mock(Database.class);
        List<Integer> listaBazaDanych2 = new ArrayList<>();
        listaBazaDanych2.add(1);
        listaBazaDanych2.add(9);

        when(database2Mock.wylosuj(2)).thenReturn(listaBazaDanych2);
        MaszynaLosujaca maszynaLosujaca2 = new MaszynaLosujaca(database2Mock);


        //When

        int result2 = maszynaLosujaca2.jackpot(1,10);
        //Then

        Assert.assertEquals(1,result2);

    }


    @Test
    public void maszynaLosujaca3Test(){

        //Given
        Database database3Mock = mock(Database.class);
        List<Integer> listaBazaDanych3 = new ArrayList<>();
        listaBazaDanych3.add(1);
        listaBazaDanych3.add(10);
        listaBazaDanych3.add(20);
        listaBazaDanych3.add(30);
        listaBazaDanych3.add(40);

        when(database3Mock.wylosuj(5)).thenReturn(listaBazaDanych3);
        MaszynaLosujaca maszynaLosujaca3 = new MaszynaLosujaca(database3Mock);


        //When
        int result3 = maszynaLosujaca3.jackpot(1, 10,15,25,35);

        //Then
        Assert.assertEquals(2,result3);
    }
}
