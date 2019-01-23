package com.readdeo.vehiclectracker.vehicletracker.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Entity
@Table(name = "device_records", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
public class DeviceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
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


    public DeviceRecord(Device device, double latitude, double longitude, long timestamp, double accuracy){

        this.device = device;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timestamp = timestamp;
        this.accuracy = accuracy;
    }

    public long getId() {
        return id;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

//    public long getDeviceId() {
//        return device.getId();
//    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
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
