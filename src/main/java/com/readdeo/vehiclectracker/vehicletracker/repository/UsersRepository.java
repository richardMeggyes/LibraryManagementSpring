package com.readdeo.vehiclectracker.vehicletracker.repository;

import com.readdeo.vehiclectracker.vehicletracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
    User findByName(String username);
    User findByid(Long id);
}
