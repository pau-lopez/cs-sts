package com.casestudy.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casestudy.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
