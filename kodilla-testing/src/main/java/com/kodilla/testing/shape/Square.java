package com.kodilla.testing.shape;

public class Square implements Shape {

    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return this.sideA * this.sideA;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Square square)) return false;

        return Double.compare(sideA, square.sideA) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(sideA);
    }
}
