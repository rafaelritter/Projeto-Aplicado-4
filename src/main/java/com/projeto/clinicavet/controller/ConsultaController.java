package com.projeto.clinicavet.controller;

import java.util.List;

import com.projeto.clinicavet.dto.RequisicaoNovaConsulta;
import com.projeto.clinicavet.model.Consulta;
import com.projeto.clinicavet.repository.ConsultaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    private ConsultaRepository consultaRepository;

    @GetMapping("/exibirConsultas")
    public String consulta(Model model) {

        List<Consulta> consultas = consultaRepository.findAll();
        model.addAttribute("consultas", consultas);
        return "consulta/consultas";
    }

    @GetMapping("/agendarConsulta")
    public String formConsulta(RequisicaoNovaConsulta requisicao) {
        return "consulta/agendarConsulta";
    }

    @PostMapping("/novo")
    public String novaConsulta(RequisicaoNovaConsulta requisicao) {

        Consulta consulta = requisicao.toConsulta();
        consultaRepository.save(consulta);
        return "consulta/agendarConsulta";
    }
}