package com.behavioral.template;

public abstract class Window {
    public void close() {
        onClose();
        System.out.println("Removing the window from the screen");
        onClosed();
    }

    protected abstract void onClose();

    protected abstract void onClosed();
}
