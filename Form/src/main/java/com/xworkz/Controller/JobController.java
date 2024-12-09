package com.xworkz.Controller;
import com.xworkz.Dto.JobDTO;

import com.xworkz.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class JobController {
 @Autowired
private JobService jobService;
    public JobController(){

        System.out.println("created JobController ");
    }
    @RequestMapping("/registration")
    public String job(JobDTO jobDTO){
       System.out.println(jobDTO.toString());
      boolean ref=this.jobService.save(jobDTO);
      if(ref){
          System.out.println("successfully saved");
      }else {System.out.println("failed");}
return "Job.jsp";

}}