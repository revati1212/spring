package com.xworks.products;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworks.products")
public class Configure {
    public Configure(){
System.out.println("created configuration");
    }
}
