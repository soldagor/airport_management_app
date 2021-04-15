package com.soldagor;

import com.soldagor.service.FlightServiceImpl;
import com.soldagor.service.api.FlightService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.DelegatingMessageSource;
import javax.sql.DataSource;

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

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        //System.out.println("context status: " + context.isActive());

        FlightService airportManager = (FlightService) context.getBean(FlightService.class);
        // var airportManager2 = (AirportManager) context.getBean(AirportManager.class);
        airportManager.createFlight("BV_123");
        airportManager.createFlight("BC_345");
        airportManager.createFlight("TM_678");
        airportManager.createFlight("TX_678");
    }
}
