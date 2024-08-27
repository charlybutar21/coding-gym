package org.charly.solidprinciples.dependencyinversion.badpractice;


// Kelas Computer yang Bergantung pada Implementasi Konkret
public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;

    public Computer() {
        this.keyboard = new Keyboard();
        this.monitor = new Monitor();
    }

    public void useComputer() {
        keyboard.type();
        monitor.display();
    }
}
