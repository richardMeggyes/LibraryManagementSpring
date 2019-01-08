package com.readdeo.vehiclectracker.vehicletracker.repository;

import com.readdeo.vehiclectracker.vehicletracker.model.Device;
import com.readdeo.vehiclectracker.vehicletracker.model.DeviceRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Integer> {

    Device findDeviceByToken(String token);
}
