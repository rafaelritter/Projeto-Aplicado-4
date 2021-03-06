package com.projeto.clinicavet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsulta;

    private String veterinarioConsulta;
    private String clienteConsulta;
    private String animalConsulta;
    private String especieConsulta;
    private String dataConsulta;
    private String horarioConsulta;

    public String getVeterinarioConsulta() {
        return veterinarioConsulta;
    }

    public void setVeterinarioConsulta(String veterinarioConsulta) {
        this.veterinarioConsulta = veterinarioConsulta;
    }

    public String getClienteConsulta() {
        return clienteConsulta;
    }

    public void setClienteConsulta(String clienteConsulta) {
        this.clienteConsulta = clienteConsulta;
    }

    public String getAnimalConsulta() {
        return animalConsulta;
    }

    public void setAnimalConsulta(String animalConsulta) {
        this.animalConsulta = animalConsulta;
    }

    public String getEspecieConsulta() {
        return especieConsulta;
    }

    public void setEspecieConsulta(String especieConsulta) {
        this.especieConsulta = especieConsulta;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(String horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

}
