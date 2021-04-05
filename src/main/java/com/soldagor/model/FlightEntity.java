package com.soldagor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_flight")
public class FlightEntity extends AbstractBaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToMany(targetEntity = UserEntity.class)
    private List<UserEntity> passengers = new ArrayList<>();

    public FlightEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserEntity> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<UserEntity> passengers) {
        this.passengers = passengers;
    }
}
