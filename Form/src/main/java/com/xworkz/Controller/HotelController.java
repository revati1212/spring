package com.xworkz.Controller;

import com.xworkz.Dto.HotelDTO;
import com.xworkz.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HotelController {
    @Autowired
    private HotelService hotelService;{
        System.out.println("created");
    }

    public HotelController() {
    }
    @RequestMapping("submit")
    public String submit(HotelDTO hotelDTO) {
        System.out.println(hotelDTO.toString());
        boolean ref3 = this.hotelService.serve(hotelDTO);
        if (ref3) {
            System.out.println("successfully saved");
        } else {
            System.out.println("failed");

        }
        return "Hotel.jsp";
    }
}