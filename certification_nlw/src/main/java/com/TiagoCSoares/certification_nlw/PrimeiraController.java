package com.TiagoCSoares.certification_nlw;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


 
@RestController         // Tudo que houver abaixo é retornado no formato json
@RequestMapping("/primeiraController") // Mapeamento da rota, caminho no browser
// outros mappings dentro deesse serão uma continuação do caminho
public class PrimeiraController {
    
    @GetMapping("/retornarPrimeiraController") // Mapeamento da rota, caminho no browser
    public Usuario retornoPrimeiraController() {
        var usuario = new Usuario("Tiago", 22);
        return usuario;
    }

    @PostMapping("/meuPrimeiroPost") //Post deve ser chamado pelo postman/insonmia/outra ferramenta
    public String primeiroPost() {
        return "Primeiro post";
    }

    record Usuario(String nome, Integer idade){

    }
}
