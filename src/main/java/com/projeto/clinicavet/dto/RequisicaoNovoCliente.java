package com.projeto.clinicavet.dto;

import com.projeto.clinicavet.model.Cliente;

public class RequisicaoNovoCliente {

    private String nomeCliente;
    private String rgCliente;
    private long cpfCliente;
    private String emailCliente;
    private String celularCliente;
    private String telefoneCliente;
    private String enderecoCliente;
    private String complementoCliente;
    private int numeroResidenciaCliente;
    private String cidadeCliente;
    private String estadoCliente;
    private long cepCliente;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }

    public long getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(long cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getComplementoCliente() {
        return complementoCliente;
    }

    public void setComplementoCliente(String complementoCliente) {
        this.complementoCliente = complementoCliente;
    }

    public int getNumeroResidenciaCliente() {
        return numeroResidenciaCliente;
    }

    public void setNumeroResidenciaCliente(int numeroResidenciaCliente) {
        this.numeroResidenciaCliente = numeroResidenciaCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public long getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(long cepCliente) {
        this.cepCliente = cepCliente;
    }

    public Cliente toCliente() {
        Cliente cliente = new Cliente();
        cliente.setNomeCliente(nomeCliente);
        cliente.setRgCliente(rgCliente);
        cliente.setCpfCliente(cpfCliente);
        cliente.setEmailCliente(emailCliente);
        cliente.setCelularCliente(celularCliente);
        cliente.setTelefoneCliente(telefoneCliente);
        cliente.setEnderecoCliente(enderecoCliente);
        cliente.setComplementoCliente(complementoCliente);
        cliente.setNumeroResidenciaCliente(numeroResidenciaCliente);
        cliente.setCidadeCliente(cidadeCliente);
        cliente.setEstadoCliente(estadoCliente);
        cliente.setCepCliente(cepCliente);
        return cliente;
    }
}
