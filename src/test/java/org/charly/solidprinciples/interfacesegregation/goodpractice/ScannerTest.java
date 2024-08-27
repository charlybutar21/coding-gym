package org.charly.solidprinciples.interfacesegregation.goodpractice;

import org.junit.jupiter.api.Test;

class ScannerTest {

    @Test
    public void testSimpleScanner() {
        Scanner scanner = new SimpleScanner();
        scanner.scan(new Document("Test Document"));
    }

}