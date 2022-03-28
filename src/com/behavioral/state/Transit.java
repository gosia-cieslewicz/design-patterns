package com.behavioral.state;

public class Transit implements TravelMode
{
    @Override
    public Object calculatingETA() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Object calculatingDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}

