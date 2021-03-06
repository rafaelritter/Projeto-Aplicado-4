package com.projeto.clinicavet.dto;

import com.projeto.clinicavet.model.Animal;

public class RequisicaoNovoAnimal {

    private String nomeAnimal;
    private String dono;
    private String especie;
    private String raca;
    private String sexo;
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

    public Animal toAnimal() {
        Animal animal = new Animal();
        animal.setNomeAnimal(nomeAnimal);
        animal.setDono(dono);
        animal.setEspecie(especie);
        animal.setRaca(raca);
        animal.setSexo(sexo);
        animal.setDataNascimentoAnimal(dataNascimentoAnimal);
        return animal;
    }
}
