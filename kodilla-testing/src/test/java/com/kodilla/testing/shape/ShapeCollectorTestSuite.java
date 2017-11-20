package com.kodilla.testing.shape;

import org.junit.*;

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
        ShapeCollector collector = new ShapeCollector();

        //When
        collector.addFigure(square);


        //Then
        Assert.assertEquals(1, collector.showFigures());
    }

    @Test
    public void testRemoveFigure(){
        //Given
        Triangle triangle = new Triangle(2,3);
        Square square = new Square(2);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(triangle);
        collector.addFigure(square);
        //When
        boolean result = collector.removeFigure(triangle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(1,collector.showFigures());
    }

    @Test
    public void testGetFigure(){
        //Given
        Triangle triangle = new Triangle(2,3);
        Square square = new Square(2);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(triangle);
        collector.addFigure(square);

        //When
        Shape retrievedSquare = collector.getFigure(1);

        //Then
        Assert.assertEquals(square,retrievedSquare);
    }
}
