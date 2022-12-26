package com.goit.shape;

public class Square extends Shape {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void drawShape() {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print("#   ");
            }
            System.out.println();
        }
    }

    @Override
    public float getArea() {
        return side * side;
    }
}
