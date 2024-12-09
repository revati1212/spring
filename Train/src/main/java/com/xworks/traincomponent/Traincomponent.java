package com.xworks.traincomponent;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Traincomponent {
    public Traincomponent() {
        System.out.println("created Traincomponent ");
    }
        @RequestMapping("/press")
        public String onPress (){
                System.out.println("created onpress");
                return "index.jsp";
    }



    }

