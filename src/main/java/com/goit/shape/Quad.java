package com.goit.shape;

public class Quad extends Shape {
    private final int height;
    private final int width;

    public Quad(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Quad(int side) {
        this(side, side);
    }

    @Override
    public void drawShape() {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("#   ");
            }
            System.out.println();
        }
    }

    @Override
    public float getArea() {
        return height * width;
    }
}
