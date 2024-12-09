package com.xworkz.Dto;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
public class MatrimonyDTO {
    private String firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;
    private String maritalStatus;
    private String religion;
    private String caste;
    private String education;
    private String occupation;
}
