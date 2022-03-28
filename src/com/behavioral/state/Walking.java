package com.behavioral.state;

public class Walking implements TravelMode
{
    @Override
    public Object calculatingETA() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object calculatingDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
