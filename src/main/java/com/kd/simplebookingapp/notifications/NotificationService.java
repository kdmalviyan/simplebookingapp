package com.kd.simplebookingapp.notifications;

import com.kd.simplebookingapp.entities.Booking;
import com.kd.simplebookingapp.entities.User;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class NotificationService {
    private final Notification notification;

    public NotificationService(final Notification notification) {
        this.notification = notification;
    }
    public void sendNotifications(Booking booking, User user) {
        notification.notify(user.getEmail(), "Booking Confirmed!",
                String.format("You have made a booking for %s", booking.getBookingDate()));
    }

}
