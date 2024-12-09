package com.xworkz.Dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PassportDTO {

    private String registerApply;
    private String passportOffice;
    private String givenName;
    private String surname;
    private String dob;
    private String loginSameAsEmail;
    private String loginId;
    private String password;
    private String confirmPassword;
    private String hintQuestion;
    private String hintAnswer;
}
