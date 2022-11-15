package com.elect.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ElectionBoothSmsImpl")
public class ElectionBoothSmsImpl implements ElectionBoothInterface{

    @Override
    public String notifyUserWithBoothInfo(){
        return "SMS Notification sent successfully";
    }
}
