package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest


public class BoardTestSuite {

    @Test
    public void testToDoListInContainer(){
        //Given

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);



        //When & Then

        System.out.println("===== Beans list for BordConfig: ===== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println("<< ===== Beans list ====");


    }

    @Test
    public void testTaskAdd(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);


        //When
        TaskList taskList = (TaskList)context.getBean("toDoList");
        taskList.addTheTask("Task 1 in toDoList");

        TaskList taskList1 = (TaskList)context.getBean("inProgressList");
        taskList1.addTheTask("Task 1 in inProgressList");

        TaskList taskList2 = (TaskList)context.getBean("doneList");
        taskList2.addTheTask("Task 1 in doneList");



        //Then
        System.out.println("======= toDoList:");
        System.out.println(taskList.getTasks().get(0));
        System.out.println("======= inProgressList:");
        System.out.println(taskList1.getTasks().get(0));
        System.out.println("======= toDoList:");
        System.out.println(taskList2.getTasks().get(0));

        Assert.assertEquals("Task 1 in toDoList",taskList.getTasks().get(0));
        Assert.assertEquals("Task 1 in inProgressList",taskList1.getTasks().get(0));
        Assert.assertEquals("Task 1 in doneList",taskList2.getTasks().get(0));

    }
}
