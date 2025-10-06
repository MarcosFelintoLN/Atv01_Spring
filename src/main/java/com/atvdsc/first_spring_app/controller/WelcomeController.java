package com.atvdsc.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Bem-vindo à primeira atividade de Sistemas Corporativos.";
    }
}
