package com.electradrive.ElectraDrive.repo;

import com.electradrive.ElectraDrive.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle, Integer> {
}
