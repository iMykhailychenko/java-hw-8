package com.goit;

import com.goit.shape.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(5),
                new EquilateralTriangle(6),
                new Square(6),
                new Diamond(5),
                new Quad(6, 9),
        };

        ShapeUtils.drawAll(shapes);
        ShapeUtils.getAreaForAll(shapes);
    }
}