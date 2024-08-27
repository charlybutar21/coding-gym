package org.charly.solidprinciples.interfacesegregation.badpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MachineTest {

    @Test
    public void testPrinterScan() {
        Printer printer = new Printer();
        assertThrows(UnsupportedOperationException.class, () -> {
            printer.scan(new Document("Test Document"));
        });
    }

    @Test
    public void testScannerPrint() {
        Scanner scanner = new Scanner();
        assertThrows(UnsupportedOperationException.class, () -> {
            scanner.print(new Document("Test Document"));
        });
    }
  
}