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

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Circle circle)) return false;

        return Double.compare(radius, circle.radius) == 0 && Double.compare(PI, circle.PI) == 0;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(radius);
        result = 31 * result + Double.hashCode(PI);
        return result;
    }
}
