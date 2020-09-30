package com.projeto.clinicavet.controller;

import java.util.List;

import javax.validation.Valid;

import com.projeto.clinicavet.dto.RequisicaoNovoAnimal;
import com.projeto.clinicavet.model.Animal;
import com.projeto.clinicavet.repository.AnimalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping("/exibirAnimais")
    public String animal(Model model) {

        List<Animal> animais = animalRepository.findAll();
        model.addAttribute("animais", animais);
        return "animais";
    }

    @GetMapping("/cadastrarAnimal")
    public String formAnimal(RequisicaoNovoAnimal requisicao) {
        return "animal/cadastrarAnimal";
    }

    @PostMapping("/novo")
    public String novoAnimal(@Valid RequisicaoNovoAnimal requisicao, BindingResult result) {

        if (result.hasErrors()) {
            return "animal/cadastrarAnimal";
        }

        Animal animal = requisicao.toAnimal();
        animalRepository.save(animal);
        return "animal/cadastrarAnimal";
    }

}
