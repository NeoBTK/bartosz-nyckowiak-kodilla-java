package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING =  "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public Task createTask(final String taskType){
        return switch (taskType){
            case SHOPPING -> new ShoppingTask("Kitchen appliance shopping", "coffe express", 1);
            case PAINTING -> new PaintingTask("Home renovation", "blue", "bedroom");
            case DRIVING -> new DrivingTask("Vacation trip", "Italy", "car");
            default -> null;
        };

    }
}
