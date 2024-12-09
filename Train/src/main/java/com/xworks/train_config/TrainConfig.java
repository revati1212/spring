package com.xworks.train_config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworks")
public class TrainConfig {
    public TrainConfig(){
        System.out.println("created train configuration");
    }
}
