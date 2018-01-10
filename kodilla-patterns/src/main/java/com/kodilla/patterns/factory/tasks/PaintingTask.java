package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(int done) {
        if (done == 1) {
            return true;
        } else return false;
    }

    @Override
    public int executeTask() {
        System.out.println(taskName + " in progress.");
        int done = 1;
        return done ;
    }
}
