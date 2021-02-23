package com.soldagor;

public class AirportManager {
    private FlightHandler flightHandler;
    private UserHandler userHandler;

    public AirportManager() {
    }

    public AirportManager(FlightHandler flightHandler, UserHandler userHandler) {
        this.flightHandler = flightHandler;
        this.userHandler = userHandler;
    }

    public void handle() {
        flightHandler.handleFlight();
        userHandler.handleUser();
    }

    public FlightHandler getFlightHandler() {
        return flightHandler;
    }

    public void setFlightHandler(FlightHandler flightHandler) {
        this.flightHandler = flightHandler;
    }

    public UserHandler getUserHandler() {
        return userHandler;
    }

    public void setUserHandler(UserHandler userHandler) {
        this.userHandler = userHandler;
    }
}
