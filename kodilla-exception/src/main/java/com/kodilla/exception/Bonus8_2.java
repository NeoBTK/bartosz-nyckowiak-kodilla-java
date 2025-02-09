package com.kodilla.exception;

public class Bonus8_2 {

    public static void main(String[] args) {
        System.out.println(pow(8, 1));
    }

    private static int pow(int a, int b) {
        int c = 1;
        if (b == 0) {
            return 1;
        }
        for (int i = 0; i < b; i++) {
            c = c * a;
        }
        return c;
    }
}
