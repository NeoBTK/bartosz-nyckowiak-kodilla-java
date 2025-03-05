package com.kodilla.good_patterns;

public class Bonus12_1 {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " equals: " + factorial(number));
    }

    private static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
