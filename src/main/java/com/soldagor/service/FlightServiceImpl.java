package com.soldagor.service;

import com.soldagor.model.FlightEntity;
import com.soldagor.repository.api.FlightRepository;
import com.soldagor.service.api.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepository flightRepository;


    @Override
    public FlightEntity createFlight(String flightName) {
        FlightEntity newFlight = new FlightEntity(flightName);
        return flightRepository.create(newFlight);
    }
}
