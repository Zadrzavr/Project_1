package org.example;

import lombok.Data;

@Data

public class Triangle {
    private int a;
    private int b;
    private int c;



    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void checkSidesArePositive() {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Sides must be positive");
        }
    }

    private void checkOneSideIsSmallerThanSumOfOthers() {
        if (a + b <= c || b + c <= a || c + a <= b) {
            throw new IllegalArgumentException("One side can't be greater than sum of others");
        }
    }

    public int countPerimeter() {
        checkSidesArePositive();
        checkOneSideIsSmallerThanSumOfOthers();
        return a + b + c;
    }




    public double countArea() {
        double pp = (a + b + c) / 2.0;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }



    public Triangle createSimilarTriangle(int coef) {
        checkSidesArePositive();
        checkOneSideIsSmallerThanSumOfOthers();
        return new Triangle(a * coef, b * coef, c * coef);
    }
}


