package com.TiagoCSoares.certification_nlw.modules.students.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.TiagoCSoares.certification_nlw.modules.students.dto.verifyHasCertificationDTO;
import com.TiagoCSoares.certification_nlw.modules.students.useCases.VerifyIfHasCertificationUseCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/students")

public class StudentController {

    // Precisa usar o USECASE
    @Autowired // Injeção de dependência, inicializar a classe abaixo automaticamente, faz um new()
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;;


    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody verifyHasCertificationDTO verifyHasCertificationDTO) {
        // Email
        // Technology
        var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);
        if(result) {
            return "Usuário já fez a prova";
        }

        //System.out.println(verifyHasCertificationDTO);
        return "Usuário pode fazer a prvoa";
    }
}
