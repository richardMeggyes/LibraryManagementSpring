package com.readdeo.vehiclectracker.vehicletracker.model;

import javax.persistence.Id;

import javax.persistence.*;

@Entity
@Table(name = "device", schema = "public")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "token", unique = true)
    private String token;

    public Device() {
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public Device(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
