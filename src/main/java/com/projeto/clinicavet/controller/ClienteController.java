package com.projeto.clinicavet.controller;

import java.util.List;

import com.projeto.clinicavet.dto.RequisicaoNovoCliente;
import com.projeto.clinicavet.model.Cliente;
import com.projeto.clinicavet.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/exibirClientes")
    public String cliente(Model model) {

        List<Cliente> clientes = clienteRepository.findAll();
        model.addAttribute("clientes", clientes);
        return "cliente/clientes";

    }

    @GetMapping("/cadastrarCliente")
    public String formCliente() {
        return "cliente/cadastrarCliente";
    }

    @PostMapping("/novo")
    public String novoCliente(RequisicaoNovoCliente requisicao) {

        Cliente cliente = requisicao.toCliente();
        clienteRepository.save(cliente);
        return "cliente/cadastrarCliente";
    }
}
