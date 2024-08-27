package org.charly.solidprinciples.interfacesegregation.badpractice;

public class Printer  implements Machine{

    @Override
    public void print(Document document) {
        System.out.println("Printing document: " + document.getContent());
    }

    @Override
    public void scan(Document document) {
        throw new UnsupportedOperationException("Scan not supported");
    }

    @Override
    public void fax(Document document) {
        throw new UnsupportedOperationException("Fax not supported");
    }
}
