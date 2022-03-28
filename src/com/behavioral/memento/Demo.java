package com.behavioral.memento;

public class Demo {
    public static void demo(String[] args) {

        var document = new Document();
        var history = new History();

        document.setContent("content");
        document.setFontName("Arial");
        document.setFontSize(12);

        history.push(document.createMemento());

        document.setContent("new content");
        document.restore(history.pop());

        System.out.println(document);
    }
}
