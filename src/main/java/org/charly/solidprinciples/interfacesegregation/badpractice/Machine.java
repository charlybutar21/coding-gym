package org.charly.solidprinciples.interfacesegregation.badpractice;

public interface Machine {
    void print(Document document);
    void scan(Document document);
    void fax(Document document);
}
