package com.kleinpix;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   01 March 2018
    Descript:   Application containing Springframework and multiple implemetation of interfaces
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ATMAppConfig
{
    @Bean(name = "ATM_0011")
    public ATMInterface getService()
    {
        return new ATMImpl();
    }
}
