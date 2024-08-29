package com.dhanush.WebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public  String greet() {
        return " Hello, Welcome to Web App " ;
    }

    @RequestMapping("/about")
    public String about() {
        return "This is a simple web app using Spring Boot";
    }

}
