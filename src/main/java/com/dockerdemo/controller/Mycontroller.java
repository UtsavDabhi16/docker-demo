package com.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

    @GetMapping("/docker")
    public String demo(){
        return "Inside demo method";
    }
}
