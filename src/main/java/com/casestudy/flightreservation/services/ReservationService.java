package com.casestudy.flightreservation.services;

import com.casestudy.flightreservation.dto.ReservationRequest;
import com.casestudy.flightreservation.entities.Reservation;

public interface ReservationService {
	public Reservation bookFlight(ReservationRequest request);
	
	
}
