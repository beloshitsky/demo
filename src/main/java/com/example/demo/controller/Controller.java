package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Controller {

    @GetMapping()
    public String sayHello() {
        return "Hello World!"+ " now on server: " + new Date();
    }
}
