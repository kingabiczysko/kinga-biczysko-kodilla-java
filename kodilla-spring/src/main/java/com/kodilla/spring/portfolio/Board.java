package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

@Component
public final class Board {

    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;




    public Board(final TaskList toDoList, final TaskList inProgressList,
                 final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }



}
