package com.casestudy.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casestudy.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
