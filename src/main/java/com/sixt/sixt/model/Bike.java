package com.sixt.sixt.model;

import javax.persistence.Column;

public class Bike extends Vehicle {

    @Column(name = "cylinder")
    private Integer cylinder;

    public Integer getCylinder() {
        return cylinder;
    }

    public void setCylinder(Integer cylinder) {
        this.cylinder = cylinder;
    }

    public Bike(Integer id,
                String licensePlate,
                String type,
                String brand,
                String model,
                String color,
                Float rentPrice,
                Float kilometerPrice,
                Integer horsePower,
                Boolean isAvailable,
                Integer cylinder) {
        super(id, licensePlate, type, brand, model, color, rentPrice, kilometerPrice, horsePower, isAvailable);
        this.cylinder = cylinder;
    }
}
