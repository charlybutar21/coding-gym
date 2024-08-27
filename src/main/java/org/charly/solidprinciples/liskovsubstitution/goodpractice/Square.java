package org.charly.solidprinciples.liskovsubstitution.goodpractice;

public class Square extends Shape{
    public Square(int size) {
        super(size, size);
    }
}
