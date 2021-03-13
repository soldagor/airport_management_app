package com.soldagor;

import org.springframework.stereotype.Component;

@Component
public class FlightHandler {
    public void handleFlight() {
        System.out.println("Handle flight from FlightHandler");
    }
}
