package com.electradrive.ElectraDrive.controller;

import com.electradrive.ElectraDrive.models.Vehicle;
import com.electradrive.ElectraDrive.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController
{
    @Autowired
    VehicleService vehicleService;

    @PostMapping("/add")
    public ResponseEntity<Vehicle> addVehicle(Vehicle vehicle)
    {
       Vehicle savedVehicle = this.vehicleService.addVehicle(vehicle);
       return ResponseEntity.ok(savedVehicle);
    }
}
