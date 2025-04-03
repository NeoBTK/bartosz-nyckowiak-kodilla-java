package com.kodilla.spring.reader;

public class Reader {
    final Book theBook;

    public Reader(final Book book) {
        this.theBook = book;
    }

    public void read() {
        System.out.println("Reading: "  + theBook.getTitle());
    }
}
