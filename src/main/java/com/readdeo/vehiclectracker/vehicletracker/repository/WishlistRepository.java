package com.readdeo.vehiclectracker.vehicletracker.repository;

import com.readdeo.vehiclectracker.vehicletracker.model.CustomUserDetails;
import com.readdeo.vehiclectracker.vehicletracker.model.User;
import com.readdeo.vehiclectracker.vehicletracker.model.Wishlist;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

//import com.readdeo.vehiclectracker.vehicletracker.model.DeviceRecord;

public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {

    Set<Wishlist> findAllByuser(User userid);
    Wishlist findByOlId(String olID);
    Wishlist findByUserAndOlId(User user, String olId);

    @Transactional
    Long deleteWishlistByUserAndOlId(User user, String olId);
//    Set<Device> findDeviceByUser(User user);
}
