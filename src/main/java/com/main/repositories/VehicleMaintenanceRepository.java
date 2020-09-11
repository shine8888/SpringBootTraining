package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.models.VehicleHire;

@Repository
public interface VehicleMaintenanceRepository extends JpaRepository<VehicleHire, Integer> {

}
