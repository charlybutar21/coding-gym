package org.charly.solidprinciples.dependencyinversion.goodpractice;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ComputerTest {

    @Test
    public void testUseComputer() {
        Keyboard keyboardMock = mock(Keyboard.class);
        Monitor monitorMock = mock(Monitor.class);

        Computer computer = new Computer(keyboardMock, monitorMock);
        computer.useComputer();

        verify(keyboardMock).type();
        verify(monitorMock).display();
    }

}