package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.*;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public StreamMain() {
    }

    public static void main(String[] args) {

        Forum forum = new Forum();


        Map <Integer, ForumUser> theResultUserFilters = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() =='M')
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() > 20)
                .filter(forumUser -> forumUser.getPostQuantity()>0)
                .collect(Collectors.toMap(ForumUser::getUserID,forumUser -> forumUser));

        System.out.println("# elements: " + theResultUserFilters.size());
        theResultUserFilters.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
