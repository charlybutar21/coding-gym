package org.charly.solidprinciples.dependencyinversion.badpractice;

import org.junit.jupiter.api.Test;

class ComputerTest {

    @Test
    public void testUseComputer() {
        Computer computer = new Computer();
        computer.useComputer();
    }

}