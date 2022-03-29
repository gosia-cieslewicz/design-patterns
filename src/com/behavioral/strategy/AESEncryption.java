package com.behavioral.strategy;

public class AESEncryption implements EncryptionAlgorithm {

    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting message using AES");
        return "AES encrypted message";
    }
}
