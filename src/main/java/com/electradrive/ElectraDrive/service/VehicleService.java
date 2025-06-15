package com.electradrive.ElectraDrive.service;

import com.electradrive.ElectraDrive.models.Vehicle;
import com.electradrive.ElectraDrive.repo.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    VehicleRepo vehicleRepo;

    public Vehicle addVehicle(Vehicle vehicle) {
        System.out.println("Working");
        return this.vehicleRepo.save(vehicle);
    }
}
