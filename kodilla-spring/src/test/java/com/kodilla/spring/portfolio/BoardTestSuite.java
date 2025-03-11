package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testContext() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        //When & Then
        System.out.println("=== Bean List Start ===");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("=== Bean List End ===");
    }

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.addToDoTask("ToDo Task 1");
        board.addInProgressTask("InProgress Task 1");
        board.addDoneTask("Done Task 1");

        //Then
        System.out.println("ToDo Tasks:");
        board.getToDoList().tasks.stream()
                .forEach(System.out::println);
        System.out.println("InProgress Tasks:");
        board.getInProgressList().tasks.stream()
                .forEach(System.out::println);
        System.out.println("Done Tasks:");
        board.getDoneList().tasks.stream()
                .forEach(System.out::println);
    }
}
