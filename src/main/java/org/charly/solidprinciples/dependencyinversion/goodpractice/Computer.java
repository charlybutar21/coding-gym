package org.charly.solidprinciples.dependencyinversion.goodpractice;

public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;

    // Dependensi disuntikkan melalui konstruktor
    public Computer(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public void useComputer() {
        keyboard.type();
        monitor.display();
    }
}
