package com.projeto.clinicavet.controller;

import java.util.List;

import com.projeto.clinicavet.dto.RequisicaoNovoVeterinario;
import com.projeto.clinicavet.model.Veterinario;
import com.projeto.clinicavet.repository.VeterinarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/veterinario")
public class VeterinarioController {

    @Autowired
    private VeterinarioRepository veterinarioRepository;

    @GetMapping("/exibirVeterinarios")
    public String veterinario(Model model) {

        List<Veterinario> veterinarios = veterinarioRepository.findAll();
        model.addAttribute("veterinarios", veterinarios);
        return "veterinario/veterinarios";
    }

    @GetMapping("/cadastrarVeterinario")
    public String formVeterinario() {
        return "veterinario/cadastrarVeterinario";
    }

    @PostMapping("/novo")
    public String novoVeterinario(RequisicaoNovoVeterinario requisicao) {

        Veterinario veterinario = requisicao.toVeterinario();
        veterinarioRepository.save(veterinario);
        return "veterinario/cadastrarVeterinario";
    }
}