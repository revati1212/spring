package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class JobConfigure {

    public JobConfigure(){
        System.out.println("created configure class");
    }
}
