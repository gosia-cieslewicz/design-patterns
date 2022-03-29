package com.behavioral.iterator;

public class Demo {
    public static void demo(String[] args) {
        var collection = new ProductCollection();

        collection.add(new Product(1, "1"));
        collection.add(new Product(2, "2"));

        Iterator iterator = collection.createIterator();

        while (iterator.hasNext()) {
            var prod =  iterator.current();
            System.out.println(prod);
            iterator.next();
        }
    }
}
