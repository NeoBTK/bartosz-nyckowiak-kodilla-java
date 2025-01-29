package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;
    private final double PI = 3.14159265358979323846;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return PI * (this.radius * this.radius);
    }
}
