package com.readdeo.vehiclectracker.vehicletracker.resource;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//
//@RequestMapping("/devicelog")
//@RestController
//public class DeviceLogger {
//
//    @GetMapping("/newpos")
//    public String hello() {
//
//
//        return "Hello Youtube";
//    }
//
//    @PreAuthorize("hasAnyRole('ADMIN')")
//    @GetMapping("/secured/all")
//    public String securedHello() {
//        return "Secured Hello";
//    }
//
//    @GetMapping("/secured/alternate")
//    public String alternate() {
//        return "alternate";
//    }
//}