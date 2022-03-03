package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.example.Triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {

    @Test
    @DisplayName("Периметр треугольника 3, 4, 6 должен быть равен 5")
    public void countPerimeterEgyptTriangleSuccessfulTest() {
        Triangle triangle = new Triangle(3, 4, 6);
        int perimeter = (int) triangle.countArea();
        assertEquals(5, perimeter);
    }


    @Test
    @DisplayName("Периметр треугольника 6, 4, 6 должен быть равен 11")
    public void countPerimeterGreater90TriangleSuccessfulTest() {
        Triangle triangle = new Triangle(6, 4, 6);
        int perimeter = (int) triangle.countArea();
        assertEquals(11, perimeter);
    }

    @Test
    @DisplayName("Периметр треугольника 3, 4, 3 должен быть равен 10")
    public void countPerimeterWithEqualSidesTriangleSuccessfulTest() {
        Triangle triangle = new Triangle(2, 3, 4);
        int perimeter = (int) triangle.countArea();
        assertEquals(2, perimeter);
    }




}

