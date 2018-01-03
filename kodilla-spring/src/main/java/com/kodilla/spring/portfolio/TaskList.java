package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class TaskList {

    private String oneTask;
    private  ArrayList<String> tasks;

    public TaskList() {
        tasks = new ArrayList<String>();
    }


    public List<String> addTheTask (String oneTask){
        tasks.add(oneTask);
        return new ArrayList<>();
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }
}
