package com.behavioral.strategy;

public class DESEncryption implements EncryptionAlgorithm{

    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting message using DES");
        return "DES encrypted message";
    }
}
