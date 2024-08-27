package org.charly.solidprinciples.dependencyinversion.goodpractice;

public class MechanicalKeyboard implements Keyboard{
    @Override
    public void type() {
        System.out.println("Typing on mechanical keyboard...");
    }
}
