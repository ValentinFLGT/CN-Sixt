package com.sixt.sixt.model;

public class Car extends Vehicle {

    public Car(Integer id,
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
