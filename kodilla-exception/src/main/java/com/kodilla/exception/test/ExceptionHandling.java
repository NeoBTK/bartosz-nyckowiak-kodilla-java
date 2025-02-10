package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.5, 3.5);
        } catch (Exception e) {
            System.out.println("Throwing exception!");
        } finally {
            System.out.println("Second challenge finally block.");
        }
    }
}
