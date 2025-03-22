package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testShoppingTaskCreation() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task task = taskFactory.createTask(TaskFactory.SHOPPING);

        //When & Then
        assertNotNull(task);
        assertEquals("Kitchen appliance shopping", task.getTaskName());
        assertFalse(task.isTaskExecuted());
        task.executeTask();
        assertTrue(task.isTaskExecuted());
    }

    @Test
    void testPaintingTaskCreation() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task task = taskFactory.createTask(TaskFactory.PAINTING);

        //When & Then
        assertNotNull(task);
        assertEquals("Home renovation", task.getTaskName());
        assertFalse(task.isTaskExecuted());
        task.executeTask();
        assertTrue(task.isTaskExecuted());
    }

    @Test
    void testDrivingTaskCreation() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task task = taskFactory.createTask(TaskFactory.DRIVING);

        //When & Then
        assertNotNull(task);
        assertEquals("Vacation trip", task.getTaskName());
        assertFalse(task.isTaskExecuted());
        task.executeTask();
        assertTrue(task.isTaskExecuted());
    }
}
