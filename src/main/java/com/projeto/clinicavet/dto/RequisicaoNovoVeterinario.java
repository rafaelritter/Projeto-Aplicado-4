package com.projeto.clinicavet.dto;

import com.projeto.clinicavet.model.Veterinario;

public class RequisicaoNovoVeterinario {

    private String nomeVeterinario;
    private long crmv;
    private String rgVeterinario;
    private long cpfVeterinario;
    private String emailVeterinario;
    private String celularVeterinario;
    private String telefoneVeterinario;
    private String enderecoVeterinario;
    private String complementoVeterinario;
    private int numeroResidenciaVeterinario;
    private String cidadeVeterinario;
    private String estadoVeterinario;
    private long cepVeterinario;

    public String getNomeVeterinario() {
        return nomeVeterinario;
    }

    public void setNomeVeterinario(String nomeVeterinario) {
        this.nomeVeterinario = nomeVeterinario;
    }

    public long getCrmv() {
        return crmv;
    }

    public void setCrmv(long crmv) {
        this.crmv = crmv;
    }

    public String getRgVeterinario() {
        return rgVeterinario;
    }

    public void setRgVeterinario(String rgVeterinario) {
        this.rgVeterinario = rgVeterinario;
    }

    public long getCpfVeterinario() {
        return cpfVeterinario;
    }

    public void setCpfVeterinario(long cpfVeterinario) {
        this.cpfVeterinario = cpfVeterinario;
    }

    public String getEmailVeterinario() {
        return emailVeterinario;
    }

    public void setEmailVeterinario(String emailVeterinario) {
        this.emailVeterinario = emailVeterinario;
    }

    public String getCelularVeterinario() {
        return celularVeterinario;
    }

    public void setCelularVeterinario(String celularVeterinario) {
        this.celularVeterinario = celularVeterinario;
    }

    public String getTelefoneVeterinario() {
        return telefoneVeterinario;
    }

    public void setTelefoneVeterinario(String telefoneVeterinario) {
        this.telefoneVeterinario = telefoneVeterinario;
    }

    public String getEnderecoVeterinario() {
        return enderecoVeterinario;
    }

    public void setEnderecoVeterinario(String enderecoVeterinario) {
        this.enderecoVeterinario = enderecoVeterinario;
    }

    public String getComplementoVeterinario() {
        return complementoVeterinario;
    }

    public void setComplementoVeterinario(String complementoVeterinario) {
        this.complementoVeterinario = complementoVeterinario;
    }

    public int getNumeroResidenciaVeterinario() {
        return numeroResidenciaVeterinario;
    }

    public void setNumeroResidenciaVeterinario(int numeroResidenciaVeterinario) {
        this.numeroResidenciaVeterinario = numeroResidenciaVeterinario;
    }

    public String getCidadeVeterinario() {
        return cidadeVeterinario;
    }

    public void setCidadeVeterinario(String cidadeVeterinario) {
        this.cidadeVeterinario = cidadeVeterinario;
    }

    public String getEstadoVeterinario() {
        return estadoVeterinario;
    }

    public void setEstadoVeterinario(String estadoVeterinario) {
        this.estadoVeterinario = estadoVeterinario;
    }

    public long getCepVeterinario() {
        return cepVeterinario;
    }

    public void setCepVeterinario(long cepVeterinario) {
        this.cepVeterinario = cepVeterinario;
    }

    public Veterinario toVeterinario() {
        Veterinario veterinario = new Veterinario();
        veterinario.setNomeVeterinario(nomeVeterinario);
        veterinario.setCrmv(crmv);
        veterinario.setRgVeterinario(rgVeterinario);
        veterinario.setCpfVeterinario(cpfVeterinario);
        veterinario.setEmailVeterinario(emailVeterinario);
        veterinario.setCelularVeterinario(celularVeterinario);
        veterinario.setTelefoneVeterinario(telefoneVeterinario);
        veterinario.setEnderecoVeterinario(enderecoVeterinario);
        veterinario.setComplementoVeterinario(complementoVeterinario);
        veterinario.setNumeroResidenciaVeterinario(numeroResidenciaVeterinario);
        veterinario.setCidadeVeterinario(cidadeVeterinario);
        veterinario.setEstadoVeterinario(estadoVeterinario);
        veterinario.setCepVeterinario(cepVeterinario);
        return veterinario;
    }
}
