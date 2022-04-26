package com.kd.simplebookingapp.controllers;

import com.kd.simplebookingapp.sevices.UserService;
import com.kd.simplebookingapp.sevices.BookingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "user")
public class UserController {
    private final BookingService bookingService;
    private final UserService userService;
    public UserController(final UserService userService,
                          final BookingService bookingService) {
        this.bookingService = bookingService;
        this.userService = userService;
    }

    @GetMapping("booking/{userId}")
    public String showBookings(@PathVariable("userId") Long userId, Model model) {
        try {
            model.addAttribute("bookings", bookingService.findByUserId(userId));
            model.addAttribute("user", userService.findById(userId).get());
        } catch (Throwable th) {
            model.addAttribute("error", th.getMessage());
        }
        return "bookings";
    }
}
