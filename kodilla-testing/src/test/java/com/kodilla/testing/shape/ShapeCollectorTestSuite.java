package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for manipulating figures")
    class TestManipulate {

        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(5);

            //When
            shapeCollector.addFigure(square);

            //Then
            Assertions.assertEquals(1, shapeCollector.getFiguresQuantity());
        }

        @Test
        public void testRemoveFigureNonExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(5);

            //When
            boolean result = shapeCollector.removeFigure(square);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(5);

            shapeCollector.addFigure(square);

            //When
            boolean result = shapeCollector.removeFigure(square);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getFiguresQuantity());
        }
    }

    @Nested
    @DisplayName("Tests for displaying figures")
    class TestDisplaying {

        @Test
        public void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(5);

            shapeCollector.addFigure(square);

            //When
            Shape retrievedFigure = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(square, retrievedFigure);
        }

        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(5);
            Triangle triangle = new Triangle(6, 4);

            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);

            //When
            shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("Square Triangle", shapeCollector.showFigures());
        }
    }
}
