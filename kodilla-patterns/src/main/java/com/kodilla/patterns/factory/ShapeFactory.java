package com.kodilla.patterns.factory;

public final class ShapeFactory {
    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";

    public final Shape makeShape(final String shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle("The rounded circle", 4.50);
            case SQUARE -> new Square("The angular square", 7.0);
            case RECTANGLE -> new Rectangle("The long rectangle", 15.0, 2.50);
            default -> null;
        };
    }
}
