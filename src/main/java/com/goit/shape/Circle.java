package com.goit.shape;

public class Circle extends Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void drawShape() {
        int N = 2 * radius + 1; // Consider a rectangle of size N*N
        int x, y; // Coordinates inside the rectangle

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                x = i - radius;
                y = j - radius;

                if (x * x + y * y <= radius * radius + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }
}
