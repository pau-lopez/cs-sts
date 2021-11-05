package com.casestudy.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casestudy.flightreservation.entities.Passenger;


public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
