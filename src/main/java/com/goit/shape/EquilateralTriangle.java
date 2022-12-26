package com.goit.shape;

public class EquilateralTriangle extends Shape {
    private final int side;

    public EquilateralTriangle(int side) {
        this.side = side;
    }

    @Override
    public void drawShape() {
        for (int i = 1; i <= side; i++) {
            for (int j = 0; j < side - i; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("#  ");
            }

            System.out.println();
        }
    }

    @Override
    public float getArea() {
        // formula https://www.cuemath.com/measurement/area-of-equilateral-triangle/
        return (float) (Math.sqrt(3) / 4) * side * side;
    }
}
