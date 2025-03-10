package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAdd() {
        //Given
        //do nothing

        //When
        double result = calculator.add(3.0, 4.4);

        //Then
        assertEquals(7.4, result);
    }

    @Test
    void testSub() {
        //Given
        //do nothing

        //When
        double result = calculator.sub(5.5, 3.0);

        //Then
        assertEquals(2.5, result);
    }

    @Test
    void testMul() {
        //Given
        //do nothing

        //When
        double result = calculator.mul(2.4, 4.2);

        //Then
        assertEquals(10.08, result);
    }

    @Test
    void testDiv() {
        //Given
        //do nothing

        //When
        double result = calculator.div(6, 2.4);

        //Then
        assertEquals(2.5, result);
    }
}
