package com.readdeo.vehiclectracker.vehicletracker.repository;

import com.readdeo.vehiclectracker.vehicletracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Integer> {
    Optional<User> findByName(String username);
}
