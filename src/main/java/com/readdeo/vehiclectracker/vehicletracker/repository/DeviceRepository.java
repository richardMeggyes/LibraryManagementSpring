package com.readdeo.vehiclectracker.vehicletracker.repository;

import com.readdeo.vehiclectracker.vehicletracker.model.Device;
//import com.readdeo.vehiclectracker.vehicletracker.model.DeviceRecord;
import com.readdeo.vehiclectracker.vehicletracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface DeviceRepository extends JpaRepository<Device, Integer> {

    Device findDeviceByToken(String token);
//    Set<Device> findDeviceByUser(User user);
}
