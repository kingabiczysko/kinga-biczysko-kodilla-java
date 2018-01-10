package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Before
    public void beforeTest(){
        System.out.println("\nTest starting.");
    }

    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Shopping List 1", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted(shopping.executeTask()));

    }

    @Test
    public  void testPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Ocean painting", painting.getTaskName());
        Assert.assertEquals(true,painting.isTaskExecuted(painting.executeTask()));
    }
    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Going to the cinema", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted(driving.executeTask()));

    }
}
