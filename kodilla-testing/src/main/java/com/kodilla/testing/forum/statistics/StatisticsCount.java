package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;

public class StatisticsCount {

    Statistics statistics;


    public StatisticsCount(Statistics statistics) {
        this.statistics = statistics;
    }

    ArrayList<Integer> staticsticsList = new ArrayList<Integer>();


    //method 1
    public ArrayList<Integer> calculateAdvStatistics (Statistics statistics){


        staticsticsList.add(0,statistics.usersNames().size());
        staticsticsList.add(1,statistics.postsCount());
        staticsticsList.add(2,statistics.commentsCount());
        staticsticsList.add(3,statistics.postsCount() / statistics.usersNames().size());
        staticsticsList.add(4,statistics.commentsCount()/statistics.usersNames().size());
        staticsticsList.add(5,statistics.commentsCount()/statistics.postsCount());


        return staticsticsList;
   }

   //method 2
   public void showStatistics(){
       System.out.println("Statistics:");
       System.out.println(staticsticsList.toArray());
   }


}
