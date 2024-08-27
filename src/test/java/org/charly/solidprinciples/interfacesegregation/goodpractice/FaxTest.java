package org.charly.solidprinciples.interfacesegregation.goodpractice;

import org.junit.jupiter.api.Test;

class FaxTest {

    @Test
    public void testSimpleFax() {
        Fax fax = new SimpleFax();
        fax.fax(new Document("Test Document"));
    }

}