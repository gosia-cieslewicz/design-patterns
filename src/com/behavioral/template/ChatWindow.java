package com.behavioral.template;

public class ChatWindow extends Window {
    @Override
    protected void onClose(){
        System.out.println("Saving changes");
    };

    @Override
    protected void onClosed(){
        System.out.println("Disconnecting from the server");
    };
}
