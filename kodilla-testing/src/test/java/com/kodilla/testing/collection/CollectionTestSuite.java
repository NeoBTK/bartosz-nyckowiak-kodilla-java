package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("when the list is empty" +
            "class should work correctly")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> list = new ArrayList<>();

        //When
        List<Integer> resultList = OddNumbersExterminator.exterminate(list);

        //Then
        Assertions.assertTrue(resultList.isEmpty());
    }

    @DisplayName("when the list contains both odd and even numbers" +
            "class should work correctly")

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //When
        List<Integer> resultList = OddNumbersExterminator.exterminate(list);
        List<Integer> expectedList = List.of(2, 4, 6, 8, 10);

        //Then
        Assertions.assertEquals(expectedList, resultList);
    }
}
