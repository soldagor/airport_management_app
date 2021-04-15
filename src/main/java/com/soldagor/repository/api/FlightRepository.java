package com.soldagor.repository.api;

import com.soldagor.model.FlightEntity;

public interface FlightRepository {
    FlightEntity create(FlightEntity flightToCreate);
}
