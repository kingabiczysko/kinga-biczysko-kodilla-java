package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
