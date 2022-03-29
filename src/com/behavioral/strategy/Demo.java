package com.behavioral.strategy;

public class Demo {

    public static void demo(String[] args) {
        var client = new ChatClient(new DESEncryption());
        client.send("new message");
    }
}
