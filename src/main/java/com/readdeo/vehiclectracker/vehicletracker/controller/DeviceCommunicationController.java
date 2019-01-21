//package com.readdeo.vehiclectracker.vehicletracker.controller;
//
//import com.readdeo.vehiclectracker.vehicletracker.model.CustomUserDetails;
////import com.readdeo.vehiclectracker.vehicletracker.model.Device;
////import com.readdeo.vehiclectracker.vehicletracker.model.DeviceRecord;
//import com.readdeo.vehiclectracker.vehicletracker.repository.DeviceRecordsRepository;
////import com.readdeo.vehiclectracker.vehicletracker.repository.DeviceRepository;
//import lombok.Builder;
//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.Set;
//
//@RequestMapping(value = "/devcom", method = RequestMethod.POST)
//@Controller
//public class DeviceCommunicationController {
//
////    @Autowired
////    private DeviceRecordsRepository deviceRecordsRepository;
////
////    @Autowired
////    private DeviceRepository deviceRepository;
//
//    private static final Logger logger = LoggerFactory.getLogger(DeviceCommunicationController.class);
//
//
//    @GetMapping("/newpos")
//    @PostMapping
//    public String deviceList(@RequestParam("t") String t, @RequestParam("d") String data, @RequestParam("dist") String dist) {
//
//        System.out.println("RequestParams:" + t);
//        System.out.println("RequestParams:" + data);
//        System.out.println("RequestParams:" + dist);
//
//        Device device = deviceRepository.findDeviceByToken(t);
//        System.out.println(device.toString());
//
//        String[] dataList = data.split(",");
//
//        Double latitude = Double.parseDouble(dataList[0]);
//        Double longitude = Double.parseDouble(dataList[1]);
//        long timestamp = Long.parseLong(dataList[4]);
//        Double accuracy = Double.parseDouble(dataList[3]);
//
//        DeviceRecord newRecord = new DeviceRecord(latitude, longitude, timestamp, accuracy, device);
//        System.out.println("NR devID:" + newRecord.getDeviceId());
//        System.out.println("NR ID:" + newRecord.getId());
//
//        deviceRecordsRepository.save(newRecord);
//
//        return "device-list";
//    }
//}
