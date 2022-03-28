package com.behavioral.state;

public class Bicycling implements TravelMode
{
    @Override
    public Object calculatingETA() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object calculatingDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}

