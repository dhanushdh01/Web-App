package com.dhanush.WebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "Login Page...";
    }
    @RequestMapping("/logout")
    public String logout() {
        return "Logout Page...";
    }
}
