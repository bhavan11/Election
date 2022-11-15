package com.elect.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ElectionBoothController {

    @GetMapping("/demoApi")
    public String getDemoString(){
        return "Success";
    }

    @GetMapping("/sendSms")
    public List<String> sendSMS(){
        return null;
    }
}