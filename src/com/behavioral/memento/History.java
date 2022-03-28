package com.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<DocumentMemento> mementos = new ArrayList<>();

    public void push(DocumentMemento memento) {
        mementos.add(memento);
    }

    public DocumentMemento pop() {
        var lastState = mementos.get(mementos.size() - 1);
        mementos.remove(lastState);
        return lastState;
    }
}
