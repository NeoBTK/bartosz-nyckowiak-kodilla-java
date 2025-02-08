package com.kodilla.stream;

public class Bonus7_6 {

    public static void main(String[] args) {
        System.out.println("Lustrzane odbicie słowa \"Adam\":");
        System.out.println(printBackward("Adam"));
        System.out.println("Lustrzane odbicie słowa \"Ewa\":");
        System.out.println(printBackward("Ewa"));
        System.out.println("Lustrzane odbicie słowa \"Kajak\":");
        System.out.println(printBackward("Kajak"));
    }

    private static String printBackward(String string) {
        String result = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            result += string.charAt(i);
        }
        return result;
    }
}
