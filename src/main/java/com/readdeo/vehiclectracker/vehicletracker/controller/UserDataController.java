package com.readdeo.vehiclectracker.vehicletracker.controller;

import com.readdeo.vehiclectracker.vehicletracker.model.User;
import com.readdeo.vehiclectracker.vehicletracker.model.Wishlist;
import com.readdeo.vehiclectracker.vehicletracker.repository.UsersRepository;
import com.readdeo.vehiclectracker.vehicletracker.repository.WishlistRepository;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;


@Controller
@ResponseBody
@CrossOrigin
public class UserDataController {

    @Autowired
    private UsersRepository userRepository;

    @Autowired
    WishlistRepository wrep;

//    @GetMapping("/addtowishlist")
//    public JSONObject greeting() {
//        User user = userRepository.findByid(0L);
//        Set<Wishlist> wishlist = wrep.findAllByuser(user);
//        System.out.println(wishlist);
//
//        Wishlist newWish = new Wishlist();
//        newWish.setUser( user);
//        newWish.setOlId("asd");
//
//        wrep.save(newWish);
//
//
//        JSONObject obj = new JSONObject();
//        obj.put("asd", "asd");
//        return obj;
//    }

//    @GetMapping("/getonwishlist")
//    public JSONObject getOnWishlist() {
//        User user = userRepository.findByid(0L);
//        Wishlist wishlist = wrep.findByOlId("OL18299598M");
//
//        System.out.println("wishlist: " + wishlist);
//
//        boolean found = false;
//        if (wishlist != null){
//            found = true;
//        }
//
//        JSONObject obj = new JSONObject();
//        obj.put("onwishlist", found);
//        return obj;
//    }

}
