package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingTestSuite {

    @Test
    void testNotThrowProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 4.33));
    }

    @Test
    void testThrowCase1ProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3.7, 4.1));
    }

    @Test
    void testThrowCase2ProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.42, 2.6));
    }

    @Test
    void testThrowCase3ProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.8, 1.5));
    }

    @Test
    void testAllProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 4.33)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3.7, 4.1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.42, 2.6)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.8, 1.5))
        );
    }
}
