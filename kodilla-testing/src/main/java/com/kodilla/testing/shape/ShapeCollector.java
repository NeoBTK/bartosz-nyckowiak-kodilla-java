package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {
        String result = "";
        for (Shape shape : shapes) {
            result += shape.getShapeName();
            if (shapes.indexOf(shape) != shapes.size() - 1) {
                result += " ";
            }
        }
        return result;
    }

    public int getFiguresQuantity() {
        return shapes.size();
    }
}
