package com.crabgeek.jetty.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrabController {

    @GetMapping("/get/hello")
    public String getHello() {
        return "HELLO";
    }
}
