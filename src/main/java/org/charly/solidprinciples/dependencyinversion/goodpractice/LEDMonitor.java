package org.charly.solidprinciples.dependencyinversion.goodpractice;

public class LEDMonitor implements Monitor{
    @Override
    public void display() {
        System.out.println("Displaying on LED monitor...");
    }
}
