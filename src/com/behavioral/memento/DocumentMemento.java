package com.behavioral.memento;

public class DocumentMemento {
    private final String content;
    private final String fontName;

    private final int fontSize;

    public DocumentMemento(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getFontName() {
        return fontName;
    }

    public String getContent() {
        return content;
    }

    public int getFontSize() {
        return fontSize;
    }
}
