package com.elect.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ElectionBoothController {

    @Autowired
    @Qualifier("ElectionBoothWhatsappImpl")
    ElectionBoothInterface electionBoothWhatsapp;
    @GetMapping("/demoApi")
    public String getDemoString(){

        return "Success";
    }

    @GetMapping("/whatsapp")
    public List<String> sendWhatsappNotification(){
        return Collections.singletonList(electionBoothWhatsapp.notifyUserWithBoothInfo());
    }

    @GetMapping("/sms")
    public List<String> sendSMS(){
        return null;
    }
}