package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        IntStream.range(1, 10).forEach(i -> library.getBooks().add(new Book("Book" + i, "Author" + i, LocalDate.now())));

        //shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Book100", "Author100", LocalDate.now()));

        //Then
        System.out.println(library.getName() + ":");
        library.getBooks().forEach(System.out::println);

        System.out.println(clonedLibrary.getName() + ":");
        clonedLibrary.getBooks().forEach(System.out::println);

        System.out.println(deepClonedLibrary.getName() + ":");
        deepClonedLibrary.getBooks().forEach(System.out::println);

        assertEquals(10, library.getBooks().size());
        assertEquals(10, clonedLibrary.getBooks().size());
        assertEquals(9, deepClonedLibrary.getBooks().size());

        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
