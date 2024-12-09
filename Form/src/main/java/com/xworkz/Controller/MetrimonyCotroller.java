package com.xworkz.Controller;

import com.xworkz.Dto.MatrimonyDTO;
import com.xworkz.Service.MatrimonyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class MetrimonyCotroller {

    @Autowired
    private MatrimonyService matrimonyService;
    public MetrimonyCotroller() {
        System.out.println("cretaed");
    }
        @RequestMapping("matri")
        public String matrimony(MatrimonyDTO matrimonyDTO){
            System.out.println(matrimonyDTO.toString());

         boolean reg4=  this.matrimonyService.find(matrimonyDTO);
         if(reg4) {
             System.out.println("succssfully saved");
         } else{
                 System.out.println("failed");
             }

         return "Matrimony.jsp";
    }
}
