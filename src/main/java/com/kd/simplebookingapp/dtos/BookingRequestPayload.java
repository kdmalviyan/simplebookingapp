package com.kd.simplebookingapp.dtos;

import com.kd.simplebookingapp.entities.User;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class BookingRequestPayload {
    private User user;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date bookingTime;
}
