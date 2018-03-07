package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTasks implements ObserableHomework {
    public String studentName;
    List<String> tasks;
    List<ObserverHomework> mentors;

    public StudentTasks(String studentName) {
        this.studentName = studentName;
        tasks = new ArrayList<>();
        mentors = new ArrayList<>();
    }

    public void addTask (String task){
        tasks.add(task);
        notifyMentors();
    }

    @Override
    public void registerMentor(ObserverHomework observerHomework){
        mentors.add(observerHomework);
    }

    @Override
    public void notifyMentors(){
        for (ObserverHomework observer : mentors){
            observer.update(this);
        }

    }

    @Override
    public void removeMentor(ObserverHomework observerHomework){
        mentors.remove(observerHomework);
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
