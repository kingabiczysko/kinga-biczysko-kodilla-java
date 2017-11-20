package com.kodilla.testing.shape;

import org.junit.*;
import com.kodilla.testing.shape.Square;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter =0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        Square square = new Square(2);
        ArrayList list1 = new ArrayList();
        ShapeCollector collector = new ShapeCollector();

        //When
        collector.addFigure(square);


        //Then
        Assert.assertEquals(1, list1.size());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Triangle triangle = new Triangle(2,3);
        ArrayList list1 = new ArrayList();
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(triangle);
        //When
        boolean result = collector.removeFigure(triangle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,list1.size());
    }

    @Test
    public void testGetFigure(){
        //Given
        Triangle triangle = new Triangle(2,3);
        Square square = new Square(2);
        ArrayList list1 = new ArrayList();
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(triangle);
        collector.addFigure(square);

        //When
        Square retrivedSquare = collector.getFigure(1);

        //Then
        Assert.assertEquals(square,retrivedSquare);
    }
}
