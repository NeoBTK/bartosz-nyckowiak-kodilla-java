package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double triangleBasis;
    private double triangleHight;

    public Triangle(double triangleBasis, double triangleHight) {
        this.triangleBasis = triangleBasis;
        this.triangleHight = triangleHight;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (this.triangleBasis * this.triangleHight) / 2;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Triangle triangle)) return false;

        return Double.compare(triangleBasis, triangle.triangleBasis) == 0 && Double.compare(triangleHight, triangle.triangleHight) == 0;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(triangleBasis);
        result = 31 * result + Double.hashCode(triangleHight);
        return result;
    }
}
