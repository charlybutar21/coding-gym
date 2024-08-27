package org.charly.solidprinciples.interfacesegregation.badpractice;

public class Scanner implements Machine{

    @Override
    public void print(Document document) {
        throw new UnsupportedOperationException("Print not supported");
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scanning document: " + document.getContent());
    }

    @Override
    public void fax(Document document) {
        throw new UnsupportedOperationException("Fax not supported");
    }
}
