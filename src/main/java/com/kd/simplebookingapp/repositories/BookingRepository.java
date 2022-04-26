package com.kd.simplebookingapp.repositories;

import com.kd.simplebookingapp.entities.User;
import com.kd.simplebookingapp.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUser(User user);
}
