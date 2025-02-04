package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("Abracadabra", s -> "ABC" + s + "ABC"));
        System.out.println(poemBeautifier.beautify("Abracadabra", s -> s.toUpperCase()));
        System.out.println(poemBeautifier.beautify("Abracadabra", s -> s.replace("a", "o")));
        System.out.println(poemBeautifier.beautify("Abracadabra", s -> s + s.length()));
        System.out.println(poemBeautifier.beautify("Abracadabra", s -> {String s1 = s.substring(4);
                                                                                        String s2 = s.substring(0, 4);
                                                                                        return s1 + s2;}));
    }
}
