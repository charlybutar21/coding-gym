package org.charly.solidprinciples.interfacesegregation.goodpractice;

import org.junit.jupiter.api.Test;

class PrinterTest {

    @Test
    public void testSimplePrinter() {
        Printer printer = new SimplePrinter();
        printer.print(new Document("Test Document"));
    }

}