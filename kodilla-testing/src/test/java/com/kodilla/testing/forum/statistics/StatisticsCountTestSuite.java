package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;

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

        Integer postNo = 0;
        when(statisticsMock.postsCount()).thenReturn(postNo);

        Integer commentsNo = 2;
        when(statisticsMock.commentsCount()).thenReturn(commentsNo);

        StatisticsCount statisticsCount = new StatisticsCount(statisticsMock);


        //When

        int quantityOfUsers = statisticsCount.calculateAdvStatistics(statisticsMock).get(0);

        //Then
        Assert.assertEquals(2,quantityOfUsers);


    }

    @Test
    public void testCalculateAdvStatisticsWithMock2(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String>nameList = new ArrayList<>();

        nameList.add("John");
        nameList.add("Rebeca");

        when(statisticsMock.usersNames()).thenReturn(nameList);

        Integer postNo = 1000;
        when(statisticsMock.postsCount()).thenReturn(postNo);

        Integer commentsNo = 2;
        when(statisticsMock.commentsCount()).thenReturn(commentsNo);

        StatisticsCount statisticsCount = new StatisticsCount(statisticsMock);


        //When

        int quantityPostPerUser = statisticsCount.calculateAdvStatistics(statisticsMock).get(3);

        //Then
        Assert.assertEquals(500,quantityPostPerUser);


    }


    @Test
    public void testCalculateAdvStatisticsWithMock3(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String>nameList = new ArrayList<>();

        nameList.add("John");
        nameList.add("Rebeca");

        when(statisticsMock.usersNames()).thenReturn(nameList);

        Integer postNo = 1000;
        when(statisticsMock.postsCount()).thenReturn(postNo);

        Integer commentsNo = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentsNo);

        StatisticsCount statisticsCount = new StatisticsCount(statisticsMock);


        //When

        int quantityOfCommentsPerPost = statisticsCount.calculateAdvStatistics(statisticsMock).get(5);

        //Then
        Assert.assertEquals(0,quantityOfCommentsPerPost);


    }
    @Test
    public void testCalculateAdvStatisticsWithMock4(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String>nameList = new ArrayList<>();

        nameList.add("John");
        nameList.add("Rebeca");

        when(statisticsMock.usersNames()).thenReturn(nameList);

        Integer postNo = 40;
        when(statisticsMock.postsCount()).thenReturn(postNo);

        Integer commentsNo = 20;
        when(statisticsMock.commentsCount()).thenReturn(commentsNo);

        StatisticsCount statisticsCount = new StatisticsCount(statisticsMock);


        //When

        int quantityOfCommentsPerPost = statisticsCount.calculateAdvStatistics(statisticsMock).get(5);

        //Then
        Assert.assertEquals(0.5,quantityOfCommentsPerPost,0.5);


    }

    @Test
    public void testCalculateAdvStatisticsWithMock5(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String>nameList = new ArrayList<>();

        nameList.add("John");
        nameList.add("Rebeca");

        when(statisticsMock.usersNames()).thenReturn(nameList);

        Integer postNo = 20;
        when(statisticsMock.postsCount()).thenReturn(postNo);

        Integer commentsNo = 40;
        when(statisticsMock.commentsCount()).thenReturn(commentsNo);

        StatisticsCount statisticsCount = new StatisticsCount(statisticsMock);


        //When

        int quantityOfCommentsPerPost = statisticsCount.calculateAdvStatistics(statisticsMock).get(5);

        //Then
        Assert.assertEquals(2,quantityOfCommentsPerPost);


    }
    @Test
    public void testCalculateAdvStatisticsWithMock6(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String>nameList = new ArrayList<>();


        when(statisticsMock.usersNames()).thenReturn(nameList);

        Integer postNo = 20;
        when(statisticsMock.postsCount()).thenReturn(postNo);

        Integer commentsNo = 40;
        when(statisticsMock.commentsCount()).thenReturn(commentsNo);

        StatisticsCount statisticsCount = new StatisticsCount(statisticsMock);


        //When

        int quantityOfUsers = statisticsCount.calculateAdvStatistics(statisticsMock).get(0);

        //Then
        Assert.assertEquals(0,quantityOfUsers);


    }
    @Test
    public void testCalculateAdvStatisticsWithMock7() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> nameList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Integer tempName = i;
            nameList.add(tempName.toString());
        }


        when(statisticsMock.usersNames()).thenReturn(nameList);

        Integer postNo = 400;
        when(statisticsMock.postsCount()).thenReturn(postNo);

        Integer commentsNo = 40;
        when(statisticsMock.commentsCount()).thenReturn(commentsNo);

        StatisticsCount statisticsCount = new StatisticsCount(statisticsMock);


        //When

        int quantityOfPostPerUser = statisticsCount.calculateAdvStatistics(statisticsMock).get(3);

        //Then
        Assert.assertEquals(4, quantityOfPostPerUser);
    }
}
