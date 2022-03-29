package com.behavioral.strategy;

public class ChatClient {
    private final EncryptionAlgorithm encryptor;

    public ChatClient(EncryptionAlgorithm encryptionAlgorithm) {
        this.encryptor = encryptionAlgorithm;
    }

    public void send(String message) {
       var encryptedMessage = encryptor.encrypt(message);
       System.out.println("Sending the encrypted message...");
    }
}
