package com.behavioral.state;

public class Driving implements TravelMode
{
    @Override
    public Object calculatingETA() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Object calculatingDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
