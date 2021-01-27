package com.sixt.sixt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "license_plate")
    private String licensePlate;

    @Column(name = "type")
    private String type;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    @Column(name = "rent_price")
    private Float rentPrice;

    @Column(name = "kilometer_price")
    private Float kilometerPrice;

    @Column(name = "horse_power")
    private Integer horsePower;

    @Column(name = "is_available")
    private Boolean isAvailable;

    public Vehicle() {
    }

    public Vehicle(Integer id,
                   String licensePlate,
                   String type, String brand,
                   String model, String color,
                   Float rentPrice,
                   Float kilometerPrice,
                   Integer horsePower,
                   Boolean isAvailable) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.rentPrice = rentPrice;
        this.kilometerPrice = kilometerPrice;
        this.horsePower = horsePower;
        this.isAvailable = isAvailable;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Float rentPrice) {
        this.rentPrice = rentPrice;
    }

    public Float getKilometerPrice() {
        return kilometerPrice;
    }

    public void setKilometerPrice(Float kilometerPrice) {
        this.kilometerPrice = kilometerPrice;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
