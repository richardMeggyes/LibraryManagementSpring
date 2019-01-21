package com.readdeo.vehiclectracker.vehicletracker.controller;

import com.readdeo.vehiclectracker.vehicletracker.model.CustomUserDetails;
import com.readdeo.vehiclectracker.vehicletracker.model.Device;
//import com.readdeo.vehiclectracker.vehicletracker.model.DeviceRecord;
//import com.readdeo.vehiclectracker.vehicletracker.repository.DeviceRecordsRepository;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Set;

@RequestMapping("/device")
@Controller
public class DeviceController {

//    @Autowired
//    private DeviceRecordsRepository deviceRecordsRepository;

    private static final Logger logger = LoggerFactory.getLogger(DeviceController.class);


    @GetMapping("/")
    public String deviceList(Model model, Authentication authentication) {

        System.out.println("USER:" + SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        CustomUserDetails cud = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Set<Device> devices = cud.getDevices();

//        HashMap<Device, DeviceRecord> deviceHashmap = new HashMap<>();
//        for (Device device : devices){
//            DeviceRecord lastPosition = deviceRecordsRepository.findTopByDevice(device);
//            deviceHashmap.put(device, lastPosition);
//        }

//        model.addAttribute("deviceHashmap", deviceHashmap);
//        logger.info("DeviceList page:"+deviceHashmap.toString());

        return "device-list";
    }
}
