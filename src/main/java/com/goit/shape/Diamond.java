package com.goit.shape;

public class Diamond extends Shape {
    private final int size;

    public Diamond(int size) {
        this.size = size;
    }

    @Override
    public void drawShape() {
        int count = 1;
        for (int i = 1; i <= 2 * size - 1; i++) {
            for (int j = count; j <= size; j++) {
                System.out.print("   ");
            }

            for (int k = 1; k <= count * 2 - 1; k++) {
                System.out.print("#  ");
            }

            if (i < size) {
                count++;
            } else {
                count--;
            }
            System.out.println();
        }
    }

    @Override
    public float getArea() {
        return size * size;
    }
}
