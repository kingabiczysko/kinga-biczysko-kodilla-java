package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCount;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCountTestSuite {

    @Test
    public void testCalculateAdvStatisticsWithMock1(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String>nameList = new ArrayList<>();

        nameList.add("John");
        nameList.add("Rebeca");

        when(statisticsMock.usersNames()).thenReturn(nameList);

        Integer postNo = 10;
        when(statisticsMock.postsCount()).thenReturn(postNo);

        Integer commentsNo = 2;
        when(statisticsMock.commentsCount()).thenReturn(commentsNo);

        StatisticsCount statisticsCount = new StatisticsCount(statisticsMock);


        //When

        int quantityOfUsers = statisticsCount.calculateAdvStatistics().get(0);

        //Then
        Assert.assertEquals(2,quantityOfUsers);


    }



}
