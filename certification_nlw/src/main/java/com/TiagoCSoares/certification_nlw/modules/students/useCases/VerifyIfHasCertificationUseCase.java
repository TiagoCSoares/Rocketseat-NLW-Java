package com.TiagoCSoares.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.TiagoCSoares.certification_nlw.modules.students.dto.verifyHasCertificationDTO;

@Service     // Camada de serviços
public class VerifyIfHasCertificationUseCase {
    
    public boolean execute( verifyHasCertificationDTO dto) {
        if(dto.getEmail().equals("tiagocsoares22@gmail.com") && dto.getTechnology().equals("Java")) {
            return true;
        }
        return false;
    }
}   
