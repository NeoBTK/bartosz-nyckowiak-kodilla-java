package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        //When
        double averageOfNumbers = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(10.5, averageOfNumbers, 0.01);
    }
}
