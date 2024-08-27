package org.charly.solidprinciples.interfacesegregation.goodpractice;

public class SimpleScanner implements Scanner{
    @Override
    public void scan(Document document) {
        System.out.println("Scanning document: " + document.getContent());
    }
}
