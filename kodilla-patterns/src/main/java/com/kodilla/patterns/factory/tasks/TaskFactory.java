package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPING TASK";
    public static final String PAINTINGTASK = "PAINTING TASK";
    public static final String DRIVINGTASK = "DRIVING TASK";

    public final Task makeTask(final String taskClass){
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping List 1", "water", 10.0);
            case PAINTINGTASK:
                return  new PaintingTask("Ocean painting", "blue", "ocean");
            case DRIVINGTASK:
                return new DrivingTask("Going to the cinema", "Multikino", "car" );
                default:
                    return null;
        }
    }
}
