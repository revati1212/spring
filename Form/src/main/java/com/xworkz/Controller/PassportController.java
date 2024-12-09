package com.xworkz.Controller;

import com.xworkz.Dto.PassportDTO;
import com.xworkz.Service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PassportController {

    @Autowired
    private PassportService passportService;
    public PassportController(){
        System.out.println("created PassportController");

    }

    @RequestMapping("/Filled")
    public String passport(PassportDTO passportDTO)
    {
        System.out.println(passportDTO.toString());

     boolean ref8= this.passportService.pass(passportDTO);
     if(ref8){
         System.out.println("successfully saved");
     }else {
         System.out.println("failed");
     }
     return "passport.jsp";
    }
}
