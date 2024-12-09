package com.xworkz.Controller;

import com.xworkz.Dto.OragndonationDTO;
import com.xworkz.Service.OrganDonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class OrganDonationController {
    @Autowired
    private OrganDonationService organDonationService;
    public OrganDonationController(){
        System.out.println("created");
    }

    @RequestMapping("/submitForm")
    public String organ(OragndonationDTO oragndonationDTO) {
        System.out.println(oragndonationDTO.toString());
        boolean ref6 = this.organDonationService.donate(oragndonationDTO);
        if (ref6) {
            System.out.println("Successfully saved");
        } else {
            System.out.println("failed");
        }

return "OrganDonation.jsp";
    }

}
