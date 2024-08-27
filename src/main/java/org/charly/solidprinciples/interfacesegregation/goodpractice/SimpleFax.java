package org.charly.solidprinciples.interfacesegregation.goodpractice;

public class SimpleFax implements Fax{
    @Override
    public void fax(Document document) {
        System.out.println("Sending fax for document: " + document.getContent());
    }
}
