package com.elect.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ElectionBoothWhatsappImpl")
public class ElectionBoothWhatsappImpl implements ElectionBoothInterface{

    @Override
    public String notifyUserWithBoothInfo(){
        return "Whatsapp Notification sent successfully";
    }

}
