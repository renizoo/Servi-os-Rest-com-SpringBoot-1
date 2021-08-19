package br.pucpr.servico;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoResource {


    @GetMapping("/consulta")
    public String consulta(){
        return "Chamando endpoint de consulta";
    }

    @PostMapping
    public String incluir(String nome){
        return "Incluindo nome";
    }



}
