package com.xworkz.Controller;

import com.xworkz.Dto.BankAccountDTO;
import com.xworkz.Service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BankAccountController {
    @Autowired
    private BankAccountService bankAccountService;
    public BankAccountController(){
        System.out.println("created BankAccountController ");
    }
    @RequestMapping("/submitBankAccount")
    public String account(BankAccountDTO bankAccountDTO){
        System.out.println(bankAccountDTO.toString());
      boolean ref1=  this.bankAccountService.created(bankAccountDTO);
      if(ref1){
          System.out.println("successfuly saved");
      }else {
          System.out.println("failed");
      }
      return "BankAccount.jsp";
    }


    }







