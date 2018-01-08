package com.kodilla.patterns.prototype;

import com.kodilla.patterns.com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.com.kodilla.patterns.prototype.TaskList;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class BoardtestSuite {
    @Test
    public void testToString(){
        //Given
        TaskList listToDo = new TaskList("To Do Tasks");
        IntStream.iterate(1,n->n+1)
                .limit(10)
                .forEach(n-> listToDo.getTasks().add(new Task("To do task number " + n)));


        TaskList listInProgress = new TaskList("In Progress Tasks");
        IntStream.iterate(1, n->n+1)
                .limit(10)
                .forEach(n->listInProgress.getTasks().add(new Task("In progress task number " + n)));

        TaskList listDone = new TaskList("Done Tasks");
        IntStream.iterate(1, n->n+1)
                .limit(10)
                .forEach(n->listDone.getTasks().add(new Task("Done task number " + n)));

        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);

        //making a shallow copy
        Board clonedBoard = null;
        try{
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy

        Board deepClonedBoard = null;
        try{
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project number 3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //System.out.println(board);
        //System.out.println(clonedBoard);

        //When
        board.getLists().remove(listToDo);
        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);
        Assert.assertEquals(2, board.getLists().size());
        Assert.assertEquals(2, clonedBoard.getLists().size());
        Assert.assertEquals(3, deepClonedBoard.getLists().size());
        Assert.assertEquals(clonedBoard.getLists(), board.getLists());
      //  Assert.assertEquals(deepClonedBoard.getLists(), board.getLists());
    }
}
