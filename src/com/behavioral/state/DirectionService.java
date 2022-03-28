package com.behavioral.state;

public class DirectionService {
    private TravelMode travelMode;

    public Object getEta() {
        return travelMode.calculatingETA();
    }

    public Object getDirection() {
        return travelMode.calculatingDirection();
    }

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
}
