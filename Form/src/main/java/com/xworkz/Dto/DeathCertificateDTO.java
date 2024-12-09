package com.xworkz.Dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
public class DeathCertificateDTO {

    private String name;
    private int Age;
    private String Adress;
    private String DOB;
    private String Lastday;
    private String CauseOfDeath;


}
