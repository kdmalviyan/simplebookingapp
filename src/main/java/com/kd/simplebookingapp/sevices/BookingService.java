package com.kd.simplebookingapp.sevices;

import com.kd.simplebookingapp.dtos.BookingRequestPayload;
import com.kd.simplebookingapp.entities.Booking;

import java.util.List;

public interface BookingService {
    void save(Booking booking);
    List<Booking> findByUserId(Long userId);

    void makeABooking(BookingRequestPayload requestPayload);
}
