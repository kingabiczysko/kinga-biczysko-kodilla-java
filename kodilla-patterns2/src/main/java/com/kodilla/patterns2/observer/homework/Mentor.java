package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverHomework {
    private String mentorName;
    private int count;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update (StudentTasks studentTasks){
        System.out.println("\nStudent: "+ studentTasks.getStudentName() + " has sent new task. "
        + "\nTotal tasks waiting from " + studentTasks.getStudentName() + ": " + studentTasks.getTasks().size()+".");
        count++;
        if (count==1) {
            System.out.println(mentorName + ", you have only " + count + " task to be checked!");
        } else {
            System.out.println(mentorName + ", you have " + count + " tasks from all students to be checked!");
        }
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getCount() {
        return count;
    }
}
