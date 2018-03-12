package com.kodilla.testing.ciag;

import org.junit.Assert;
import org.junit.Test;

public class CiagTestingSute {

    @Test
    public void FibanaciCalculationTest(){

        //Given
        CiagFibanaci ciagFibanaci = new CiagFibanaci();


        //When
        int result = ciagFibanaci.fibanaciCalculation(10);


        //Then

        Assert.assertEquals(55, result);


    }
}
