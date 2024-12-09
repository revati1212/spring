package com.xworkz.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OragndonationDTO {
    private String Donor_Name;
    private int Donor_Age;
    private String DonorBloodType;
    private String organType;

    private String donorContactInfo;
    private String Patient_Name;
    private String patient_BloodType;
    private String patient_ContactInfo;
    private String donationDate;
}
