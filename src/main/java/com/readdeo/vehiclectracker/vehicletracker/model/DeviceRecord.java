package com.readdeo.vehiclectracker.vehicletracker.model;

import lombok.Builder;

import javax.persistence.*;

@Builder
@Entity
@Table(name = "device_records", schema = "public")
public class DeviceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    private Device device;
    @Column(name = "latitude")
    private double latitude;
    @Column(name = "longitude")
    private double longitude;
    @Column(name = "timestamp")
    private long timestamp;
    @Column(name = "accuracy")
    private double accuracy;

//    localDateTime

    public DeviceRecord(){

    }

    public DeviceRecord(double latitude, double longitude, long timestamp, double accuracy, Device device){

        this.latitude = latitude;
        this.longitude = longitude;
        this.timestamp = timestamp;
        this.accuracy = accuracy;
        this.device = device;
    }

    public int getId() {
        return id;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getDeviceId() {
        return device.getId();
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return "DeviceRecord{" +
                "id=" + id +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", timestamp=" + timestamp +
                ", device=" + device +
                '}';
    }
}
