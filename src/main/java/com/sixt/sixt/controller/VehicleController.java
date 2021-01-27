package com.sixt.sixt.controller;

import com.sixt.sixt.jpa.VehicleJpa;
import com.sixt.sixt.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VehicleController {

    @Autowired
    private VehicleJpa vehicleJpa;

    @GetMapping("/")
    public String index() {
        return "Welcome to Sixt! 💩";
    }

    @GetMapping("/vehicle")
    public List<Vehicle> listCharacter() {
        return vehicleJpa.findAll();
    }

    @GetMapping("/vehicle/{id}")
    public Optional<Vehicle> getById(@PathVariable int id) {
        return vehicleJpa.findById(id);
    }

    @PostMapping("/vehicle")
    public Vehicle save(@RequestBody Vehicle vehicle) {
        return vehicleJpa.save(vehicle);
    }

    @DeleteMapping("/vehicle/{id}")
    public void delete(@PathVariable int id) {
        vehicleJpa.deleteById(id);
    }

    @PutMapping("/vehicle")
    public void update(@RequestBody Vehicle vehicle) {
        vehicleJpa.save(vehicle);
    }

}
