package com.kodilla.patterns2.observer.homework;

public interface ObserableHomework {
    void registerMentor(ObserverHomework observerHomework);
    void notifyMentors();
    void removeMentor(ObserverHomework observerHomework);
}
