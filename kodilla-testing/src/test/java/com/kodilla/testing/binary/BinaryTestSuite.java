package com.kodilla.testing.binary;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTestSuite {

    @Test
    public void changeIntoIntTest(){


        //Given
        Binary binary = new Binary();

        //When
        double result = binary.changeIntoInt(1111111);

        //Then
        Assert.assertEquals(127, result, 0);

    }
}
