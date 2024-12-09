package com.xworkz.Implementation;

import com.xworkz.Dto.DeathCertificateDTO;
import com.xworkz.Service.DeathCertificateService;

public class DeathImpl implements DeathCertificateService {
    @Override
    public boolean submit(DeathCertificateDTO deathCertificateDTO) {
        return true;

    }
}
