package com.sixt.sixt.jpa;

import com.sixt.sixt.model.Vehicle;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VehicleJpa extends JpaRepository<Vehicle, Integer> {

}

