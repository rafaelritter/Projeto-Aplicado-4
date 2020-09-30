package com.projeto.clinicavet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdAnimal;

    @NotBlank
    private String nomeAnimal;
    @NotBlank
    private String dono;
    @NotBlank
    private String especie;
    @NotBlank
    private String raca;
    @NotBlank
    private String sexo;
    @NotBlank
    private String dataNascimentoAnimal;

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimentoAnimal() {
        return dataNascimentoAnimal;
    }

    public void setDataNascimentoAnimal(String dataNascimentoAnimal) {
        this.dataNascimentoAnimal = dataNascimentoAnimal;
    }
}
