package com.soldagor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * dependency management - classic vs now
 */
public class  MainApp {
    public static void main(String[] args) {

/*      FlightHandler flightHandler = new FlightHandler();
        UserValidator userValidator = new UserValidator();
        UserHandler userHandler = new UserHandler(userValidator);
        AirportManager airportManager = new AirportManager(flightHandler,userHandler);
        airportManager.handle();*/

        var context = new ClassPathXmlApplicationContext("context.xml");

        var airportmanager =
                (AirportManager) context.getBean("airportManager");
        airportmanager.handle();
    }
}
