package org.charly.solidprinciples.liskovsubstitution.goodpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    public void testSquareArea() {
        Square square = new Square(5);
        assertEquals(25, square.getArea());
    }

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(5, 6);
        assertEquals(30, rectangle.getArea());
    }

}