package com.casestudy.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casestudy.flightreservation.entities.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
