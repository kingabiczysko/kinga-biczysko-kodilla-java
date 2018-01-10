package com.kodilla.patterns.strategy.social;

public class User {
    private final String userName;
    protected SocialPublisher socialPublisher;


    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String sharePost(){
        return "I do share post by " + socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }
}
