package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;

@RestController
@RequestMapping("/vehicles") // base path
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    // CREATE
    @PostMapping
    public Vehicle postVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.insertVehicle(vehicle);
    }

    // READ ALL
    @GetMapping
    public List<Vehicle> getAll() {
        return vehicleService.getAllVehicles();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Optional<Vehicle> getById(@PathVariable Long id) {
        return vehicleService.getOneVehicle(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public String updateVehicle(@PathVariable Long id, @RequestBody Vehicle v) {
        Optional<Vehicle> vehicleOpt = vehicleService.getOneVehicle(id);

        if (vehicleOpt.isPresent()) {
            Vehicle vehicle = vehicleOpt.get();
            vehicle.setModel(v.getModel());
            vehicle.setBrand(v.getBrand());
            vehicle.setNumber(v.getNumber());

            vehicleService.insertVehicle(vehicle);
            return "Updated Successfully ✅";
        }
        return "Vehicle Not Found ❌";
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteVehicle(@PathVariable Long id) {
        Optional<Vehicle> vehicle = vehicleService.getOneVehicle(id);

        if (vehicle.isPresent()) {
            vehicleService.deleteVehicle(id);
            return "Deleted Successfully ✅";
        }
        return "Vehicle Not Found ❌";
    }
}
