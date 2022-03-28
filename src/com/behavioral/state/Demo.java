package com.behavioral.state;

public class Demo {
    public static void main(String[] args) {
        var service = new DirectionService();
        service.setTravelMode(new Bicycling());

        var eta = service.getEta();
        var direction = service.getDirection();

        System.out.println(eta);
        System.out.println(direction);
    }
}
