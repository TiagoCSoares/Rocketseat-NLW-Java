package com.TiagoCSoares.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data    // Gera os métodos getters e setters através do lombok
@AllArgsConstructor // Gera um construtor com todos os atributos da classe
@NoArgsConstructor // Gera um construtor vazio

public class StudentEntity {

    private UUID id;
    private String email;
    private List<CertificationStudentEntity> certificationsStudentEntity;

}
