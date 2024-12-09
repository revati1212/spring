package com.xworkz.Controller;

import com.xworkz.Dto.ScholershipDTO;
import com.xworkz.Service.ScholershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ScholershipController {

    @Autowired
    private ScholershipService scholershipService;
    public ScholershipController(){
        System.out.println("created ScholershipComponent");
    }

    @RequestMapping("/submitScholarship")
    public String payment(ScholershipDTO scholershipDTO){
        System.out.println(scholershipDTO.toString());
       boolean ref7= this.scholershipService.register(scholershipDTO);
       if(ref7){
           System.out.println("successfully saved");
       }else{
           System.out.println("Failed");
       }
       return "Scholership.jsp";
    }

}
