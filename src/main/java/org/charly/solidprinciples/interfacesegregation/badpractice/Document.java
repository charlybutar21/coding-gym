package org.charly.solidprinciples.interfacesegregation.badpractice;

public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
