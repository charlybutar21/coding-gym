package org.charly.solidprinciples.liskovsubstitution.badpractice;

public class Square extends Rectangle{

    public Square(int size) {
        super(size, size);
    }

    // Melanggar prinsip Liskov Substitution
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // Mengubah ketinggian juga
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height); // Mengubah lebar juga
    }
}
