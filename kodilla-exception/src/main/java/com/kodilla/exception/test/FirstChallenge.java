package com.kodilla.exception.test;

public class FirstChallenge {

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 1);
            System.out.println("Wynik: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Pamiętaj cholero nie dziel przez zero!");
        }
    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
