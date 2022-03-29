package com.behavioral.iterator;

public interface Iterator {
    void next();
    Product current();
    boolean hasNext();
}
