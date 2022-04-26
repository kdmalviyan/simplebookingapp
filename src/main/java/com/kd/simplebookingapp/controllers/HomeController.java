package com.kd.simplebookingapp.controllers;

import com.kd.simplebookingapp.sevices.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final UserService userService;
    public HomeController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = {"/", "/home"})
    public String index(Model model) {
        try {
            model.addAttribute("users", userService.findAll());
        } catch (Throwable th) {
            model.addAttribute("error", th.getMessage());
        }
        return "index";
    }
}
