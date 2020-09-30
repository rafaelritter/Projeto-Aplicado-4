package com.projeto.clinicavet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

    @GetMapping("/login")
    public String loginUsuario() {
        return "loginUsuario";
    }
}
