package com.br.gerenciamento_clinica.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @PostMapping
    public void cadastrarMedico(String json) {
        System.out.println(json);

    }
}
