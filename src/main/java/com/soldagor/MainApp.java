package com.soldagor;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.DelegatingMessageSource;

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
        System.out.println("context status: " + context.isActive());

        var airportmanager = (AirportManager) context.getBean(AirportManager.class);
        var airportmanager2 = (AirportManager) context.getBean(AirportManager.class);
        airportmanager.handle();
    }
}
