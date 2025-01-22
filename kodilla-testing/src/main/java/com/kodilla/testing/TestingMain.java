package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int a = 6;
        int b = 5;

        // Add method test
        if (calculator.add(a, b) == 11) {
            System.out.println("Add method - Test OK");
        } else {
            System.out.println("Add method - Error!");
        }

        // Subtract method test
        if (calculator.subtract(a, b) == 1) {
            System.out.println("Subtract method - Test OK");
        } else {
            System.out.println("Subtract method - Error!");
        }
    }
}
