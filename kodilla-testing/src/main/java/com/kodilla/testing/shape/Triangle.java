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
}
