package org.charly.solidprinciples.interfacesegregation.goodpractice;

public class SimplePrinter implements Printer{
    @Override
    public void print(Document document) {
        System.out.println("Printing document: " + document.getContent());
    }
}
