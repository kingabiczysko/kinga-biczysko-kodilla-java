package com.kodilla.stream.forumuser;

import java.time.Month;
import java.time.LocalDate;
import java.util.*;

public class Forum {


    private final List <ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(1, "Jan Kowalski", 'M', LocalDate.of(1992,Month.JANUARY,15),0));
        forumUserList.add(new ForumUser(2, "Jola Lojalna",'F', LocalDate.of(1979,Month.FEBRUARY,15), 20));
        forumUserList.add(new ForumUser(3, "Jaś Fasola", 'M', LocalDate.of(2000,Month.MARCH,15), 15));
        forumUserList.add(new ForumUser(4, "John Smith", 'M', LocalDate.of(1979,Month.APRIL,15), 50));
        forumUserList.add(new ForumUser(5, "Henrik Hansen", 'M', LocalDate.of(1991,Month.MAY,15), 40));

    }

    public List <ForumUser> getUserList(){
        return new ArrayList<>(forumUserList);
    }
}
