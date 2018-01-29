package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "To Do High";
    private static final String DESCRIPTION = "List contains tasks that need to be done - high priority.";

    @Test
    public void testFindByListName(){
        //Given

        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);


        //When
        String name = taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);

        //Then
        Assert.assertEquals(1, readTaskList.size());
        Assert.assertEquals("To Do High", name);

        //CleanUp
        int id = readTaskList.get(0).getId();
        taskListDao.delete(id);

    }
}
