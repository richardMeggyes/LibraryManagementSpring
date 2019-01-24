package com.readdeo.vehiclectracker.vehicletracker.controller;

import com.readdeo.vehiclectracker.vehicletracker.model.User;
import com.readdeo.vehiclectracker.vehicletracker.model.Wishlist;
import com.readdeo.vehiclectracker.vehicletracker.repository.UsersRepository;
import com.readdeo.vehiclectracker.vehicletracker.repository.WishlistRepository;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/wishlist")
public class WishlistController {

    @Autowired
    private UsersRepository userRepository;

    @Autowired
    WishlistRepository wrep;

    @CrossOrigin
    @PostMapping("/onwishlist")
    public JSONObject onwishlist(@RequestParam("OLID") String olId) {
        User user = userRepository.findByid(0L);
        Wishlist wishlist = wrep.findByOlId(olId);

        System.out.println("wishlist: " + wishlist);

        boolean found = false;
        if (wishlist != null){
            found = true;
        }

        JSONObject obj = new JSONObject();
        obj.put("onwishlist", found);
        return obj;
    }


    @PostMapping("/add")
    public JSONObject greeting(@RequestParam("OLID") String olId) {
        User user = userRepository.findByid(0L);

        Wishlist book = wrep.findByUserAndOlId(user, olId);
        JSONObject obj = new JSONObject();
        if (book == null) {
            Wishlist newWish = new Wishlist();
            newWish.setUser(user);
            newWish.setOlId(olId);
            wrep.save(newWish);
            obj.put("success", true);
        } else {
            obj.put("success", false);
            System.out.println("shit was already in db");
        }
        return obj;
    }

    @PostMapping("/remove")
    public JSONObject remove(@RequestParam("OLID") String olId) {
        User user = userRepository.findByid(0L);
        Set<Wishlist> wishlist = wrep.findAllByuser(user);
        System.out.println("olId: " + olId);


        Long book = wrep.deleteWishlistByUserAndOlId(user, olId);
        System.out.println("book: " + book);

        JSONObject obj = new JSONObject();
        if (book == 1){
            obj.put("success", true);
        } else {
            obj.put("success", false);
        }
        return obj;
    }
}
