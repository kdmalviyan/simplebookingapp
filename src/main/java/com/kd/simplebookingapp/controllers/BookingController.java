package com.kd.simplebookingapp.controllers;

import com.kd.simplebookingapp.dtos.BookingRequestPayload;
import com.kd.simplebookingapp.sevices.BookingService;
import com.kd.simplebookingapp.sevices.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "booking")
public class BookingController {
    private final UserService userService;
    private final BookingService bookingService;

    public BookingController(final UserService userService,
                             final BookingService bookingService) {
        this.userService = userService;
        this.bookingService = bookingService;
    }

    @PostMapping()
    public String makeABooking(@ModelAttribute BookingRequestPayload requestPayload,
                               Model model) {
        try {
            bookingService.makeABooking(requestPayload);
            model.addAttribute("users", userService.findAll());
            model.addAttribute("message", "Success");
        } catch (Throwable th) {
            model.addAttribute("requestPayload", requestPayload);
            model.addAttribute("message", "Failed");
            model.addAttribute("error", th.getMessage());
            model.addAttribute("users", userService.findAll());
        }
        return "booking";
    }

    @GetMapping()
    public String renderBookingPage(Model model) {
        try {
            model.addAttribute("users", userService.findAll());
        } catch (Throwable th) {
            model.addAttribute("error", th.getMessage());
        }
        return "booking";
    }
}
