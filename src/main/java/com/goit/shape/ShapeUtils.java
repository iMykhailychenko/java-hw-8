package com.goit.shape;

public final class ShapeUtils {
    public static void drawAll(Shape[] shapes) {
        for(Shape shape: shapes) {
            draw(shape);
        }
    }

    public static void draw(Shape shape) {
        System.out.println("\nDraw " + shape.getClass().getSimpleName() + ": ");
        shape.drawShape();
    }

    public static void getAreaForAll(Shape[] shapes) {
        for(Shape shape: shapes) {
            getArea(shape);
        }
    }

    public static void  getArea(Shape shape) {
        System.out.println("\nArea of " + shape.getClass().getSimpleName() + " is:\n" + shape.getArea());

    }
}
