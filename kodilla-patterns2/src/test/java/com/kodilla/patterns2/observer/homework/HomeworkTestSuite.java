package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {
    @Test
    public void testHomeworkUpdate(){
        //Given
        StudentTasks student1Tasks = new StudentTasks1();
        StudentTasks student2Tasks = new StudentTasks2();
        StudentTasks student3Tasks = new StudentTasks3();

        Mentor mentorJas = new Mentor("Mentor Jas");
        Mentor mentorStas = new Mentor("Mentor Stas");

        student1Tasks.registerMentor(mentorJas);
        student2Tasks.registerMentor(mentorStas);
        student3Tasks.registerMentor(mentorStas);

        //When
        student1Tasks.addTask("Zadanie 1");
        student1Tasks.addTask("Zadanie 2");
        student1Tasks.addTask("Zadanie 3");

        student2Tasks.addTask("Zadanie 3");
        student2Tasks.addTask("Zadanie 4");

        student3Tasks.addTask("Zadanie 1");
        student3Tasks.addTask("Zadanie 2");

        //Then
        Assert.assertEquals(3, mentorJas.getCount());
        Assert.assertEquals(4, mentorStas.getCount());
    }
}
