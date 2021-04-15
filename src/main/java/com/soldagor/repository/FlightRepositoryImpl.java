package com.soldagor.repository;

import com.soldagor.model.FlightEntity;
import com.soldagor.repository.api.FlightRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class FlightRepositoryImpl implements FlightRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public FlightEntity create(FlightEntity flightToCreate) {
        entityManager.persist(flightToCreate);
        return flightToCreate;
    }
}
