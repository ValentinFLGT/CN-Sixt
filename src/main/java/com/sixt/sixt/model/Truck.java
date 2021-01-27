package com.sixt.sixt.model;

import javax.persistence.Column;

public class Truck extends Vehicle {

    @Column(name = "volume")
    private Integer volume;

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Truck(Integer id,
                 String licensePlate,
                 String type,
                 String brand,
                 String model,
                 String color,
                 Float rentPrice,
                 Float kilometerPrice,
                 Integer horsePower,
                 Boolean isAvailable) {
        super(id, licensePlate, type, brand, model, color, rentPrice, kilometerPrice, horsePower, isAvailable);
    }
}
